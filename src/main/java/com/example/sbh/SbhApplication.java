package com.example.sbh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})

public class SbhApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SbhApplication.class, args);
	}

	public void run(String... varl) throws Exception{
		Configuration configuration=new Configuration();
		Configuration configure=configuration.configure("hibernate.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Booktb book= session.get(Booktb.class,2L);
		System.out.println(book.toString());
	}
}
