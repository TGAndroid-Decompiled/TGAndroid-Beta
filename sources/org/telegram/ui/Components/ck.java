package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class ck implements Comparator {
    public final int f23746a;
    public final pk f23747b;

    public ck(pk pkVar, int i10) {
        this.f23746a = i10;
        this.f23747b = pkVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        jk jkVar = (jk) obj;
        jk jkVar2 = (jk) obj2;
        switch (this.f23746a) {
            case 0:
                pk pkVar = this.f23747b;
                pkVar.getClass();
                File file = jkVar.f26069f;
                if (file != null) {
                    if (jkVar2.f26069f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != jkVar2.f26069f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !pkVar.f28037c0) {
                            int i10 = (jkVar.f26069f.lastModified() > jkVar2.f26069f.lastModified() ? 1 : (jkVar.f26069f.lastModified() == jkVar2.f26069f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return jkVar.f26069f.getName().compareToIgnoreCase(jkVar2.f26069f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f23747b.f28037c0) {
                    return jkVar.f26069f.getName().compareToIgnoreCase(jkVar2.f26069f.getName());
                }
                int i11 = (jkVar.f26069f.lastModified() > jkVar2.f26069f.lastModified() ? 1 : (jkVar.f26069f.lastModified() == jkVar2.f26069f.lastModified() ? 0 : -1));
                if (i11 == 0) {
                    return 0;
                }
                if (i11 > 0) {
                    return -1;
                }
                return 1;
        }
    }
}
