package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class bk implements Comparator {
    public final int f22758a;
    public final ok f22759b;

    public bk(ok okVar, int i10) {
        this.f22758a = i10;
        this.f22759b = okVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        ik ikVar = (ik) obj;
        ik ikVar2 = (ik) obj2;
        switch (this.f22758a) {
            case 0:
                ok okVar = this.f22759b;
                okVar.getClass();
                File file = ikVar.f24949f;
                if (file != null) {
                    if (ikVar2.f24949f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != ikVar2.f24949f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !okVar.f26758c0) {
                            int i10 = (ikVar.f24949f.lastModified() > ikVar2.f24949f.lastModified() ? 1 : (ikVar.f24949f.lastModified() == ikVar2.f24949f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return ikVar.f24949f.getName().compareToIgnoreCase(ikVar2.f24949f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f22759b.f26758c0) {
                    return ikVar.f24949f.getName().compareToIgnoreCase(ikVar2.f24949f.getName());
                }
                int i11 = (ikVar.f24949f.lastModified() > ikVar2.f24949f.lastModified() ? 1 : (ikVar.f24949f.lastModified() == ikVar2.f24949f.lastModified() ? 0 : -1));
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
