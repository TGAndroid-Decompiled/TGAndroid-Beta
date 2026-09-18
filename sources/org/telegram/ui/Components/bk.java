package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class bk implements Comparator {
    public final int f22761a;
    public final ok f22762b;

    public bk(ok okVar, int i10) {
        this.f22761a = i10;
        this.f22762b = okVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        ik ikVar = (ik) obj;
        ik ikVar2 = (ik) obj2;
        switch (this.f22761a) {
            case 0:
                ok okVar = this.f22762b;
                okVar.getClass();
                File file = ikVar.f24952f;
                if (file != null) {
                    if (ikVar2.f24952f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != ikVar2.f24952f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !okVar.f26761c0) {
                            int i10 = (ikVar.f24952f.lastModified() > ikVar2.f24952f.lastModified() ? 1 : (ikVar.f24952f.lastModified() == ikVar2.f24952f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return ikVar.f24952f.getName().compareToIgnoreCase(ikVar2.f24952f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f22762b.f26761c0) {
                    return ikVar.f24952f.getName().compareToIgnoreCase(ikVar2.f24952f.getName());
                }
                int i11 = (ikVar.f24952f.lastModified() > ikVar2.f24952f.lastModified() ? 1 : (ikVar.f24952f.lastModified() == ikVar2.f24952f.lastModified() ? 0 : -1));
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
