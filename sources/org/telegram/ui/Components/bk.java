package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class bk implements Comparator {
    public final int f22820a;
    public final ok f22821b;

    public bk(ok okVar, int i10) {
        this.f22820a = i10;
        this.f22821b = okVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        ik ikVar = (ik) obj;
        ik ikVar2 = (ik) obj2;
        switch (this.f22820a) {
            case 0:
                ok okVar = this.f22821b;
                okVar.getClass();
                File file = ikVar.f25045f;
                if (file != null) {
                    if (ikVar2.f25045f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != ikVar2.f25045f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !okVar.f26819c0) {
                            int i10 = (ikVar.f25045f.lastModified() > ikVar2.f25045f.lastModified() ? 1 : (ikVar.f25045f.lastModified() == ikVar2.f25045f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return ikVar.f25045f.getName().compareToIgnoreCase(ikVar2.f25045f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f22821b.f26819c0) {
                    return ikVar.f25045f.getName().compareToIgnoreCase(ikVar2.f25045f.getName());
                }
                int i11 = (ikVar.f25045f.lastModified() > ikVar2.f25045f.lastModified() ? 1 : (ikVar.f25045f.lastModified() == ikVar2.f25045f.lastModified() ? 0 : -1));
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
