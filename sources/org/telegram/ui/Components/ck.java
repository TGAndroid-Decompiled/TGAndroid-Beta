package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class ck implements Comparator {
    public final int f24089a;
    public final pk f24090b;

    public ck(pk pkVar, int i10) {
        this.f24089a = i10;
        this.f24090b = pkVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        jk jkVar = (jk) obj;
        jk jkVar2 = (jk) obj2;
        switch (this.f24089a) {
            case 0:
                pk pkVar = this.f24090b;
                pkVar.getClass();
                File file = jkVar.f26399f;
                if (file != null) {
                    if (jkVar2.f26399f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != jkVar2.f26399f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !pkVar.f28349c0) {
                            int i10 = (jkVar.f26399f.lastModified() > jkVar2.f26399f.lastModified() ? 1 : (jkVar.f26399f.lastModified() == jkVar2.f26399f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return jkVar.f26399f.getName().compareToIgnoreCase(jkVar2.f26399f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f24090b.f28349c0) {
                    return jkVar.f26399f.getName().compareToIgnoreCase(jkVar2.f26399f.getName());
                }
                int i11 = (jkVar.f26399f.lastModified() > jkVar2.f26399f.lastModified() ? 1 : (jkVar.f26399f.lastModified() == jkVar2.f26399f.lastModified() ? 0 : -1));
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
