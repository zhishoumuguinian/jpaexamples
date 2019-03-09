package com.example.jpaexamples;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;


@SpringBootApplication
@Slf4j
public class JpaexamplesApplication {

    public static void main(String[] args) {
//        System.out.println("第一次运行");
        log.debug("第一次运行");
//        Date date = new Date();
//        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        log.debug(sf.format(date));
        SpringApplication.run(JpaexamplesApplication.class, args);
    }

}
