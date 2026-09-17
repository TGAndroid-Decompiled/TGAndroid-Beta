package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class bk implements Comparator {
    public final int f24742a;
    public final ok f24743b;

    public bk(ok okVar, int i10) {
        this.f24742a = i10;
        this.f24743b = okVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        ik ikVar = (ik) obj;
        ik ikVar2 = (ik) obj2;
        switch (this.f24742a) {
            case 0:
                ok okVar = this.f24743b;
                okVar.getClass();
                File file = ikVar.f27156f;
                if (file != null) {
                    if (ikVar2.f27156f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != ikVar2.f27156f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !okVar.f29088c0) {
                            int i10 = (ikVar.f27156f.lastModified() > ikVar2.f27156f.lastModified() ? 1 : (ikVar.f27156f.lastModified() == ikVar2.f27156f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return ikVar.f27156f.getName().compareToIgnoreCase(ikVar2.f27156f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f24743b.f29088c0) {
                    return ikVar.f27156f.getName().compareToIgnoreCase(ikVar2.f27156f.getName());
                }
                int i11 = (ikVar.f27156f.lastModified() > ikVar2.f27156f.lastModified() ? 1 : (ikVar.f27156f.lastModified() == ikVar2.f27156f.lastModified() ? 0 : -1));
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
