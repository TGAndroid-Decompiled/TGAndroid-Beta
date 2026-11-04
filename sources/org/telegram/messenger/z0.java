package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
public abstract class z0 {
    public static final Set f26694a = Collections.newSetFromMap(new ConcurrentHashMap());

    public static void a(File file, ArrayList arrayList) {
        File[] listFiles;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    a(file2, arrayList);
                } else if (!file2.getName().equals(".nomedia") && !f26694a.contains(file2.getAbsolutePath())) {
                    arrayList.add(new y0(file2));
                }
            }
        }
    }

    public static void b(File file) {
        String absolutePath;
        if (file == null || (absolutePath = file.getAbsolutePath()) == null) {
            return;
        }
        f26694a.remove(absolutePath);
    }
}
