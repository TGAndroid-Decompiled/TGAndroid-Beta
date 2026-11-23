package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class xj implements Comparator {
    public final int f42055a;
    public final kk f42056b;

    public xj(kk kkVar, int i7) {
        this.f42055a = i7;
        this.f42056b = kkVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        ek ekVar = (ek) obj;
        ek ekVar2 = (ek) obj2;
        switch (this.f42055a) {
            case 0:
                kk kkVar = this.f42056b;
                kkVar.getClass();
                File file = ekVar.f34735f;
                if (file != null) {
                    if (ekVar2.f34735f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != ekVar2.f34735f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !kkVar.f36761d0) {
                            int i7 = (ekVar.f34735f.lastModified() > ekVar2.f34735f.lastModified() ? 1 : (ekVar.f34735f.lastModified() == ekVar2.f34735f.lastModified() ? 0 : -1));
                            if (i7 == 0) {
                                return 0;
                            }
                            if (i7 > 0) {
                            }
                        } else {
                            return ekVar.f34735f.getName().compareToIgnoreCase(ekVar2.f34735f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f42056b.f36761d0) {
                    return ekVar.f34735f.getName().compareToIgnoreCase(ekVar2.f34735f.getName());
                }
                int i10 = (ekVar.f34735f.lastModified() > ekVar2.f34735f.lastModified() ? 1 : (ekVar.f34735f.lastModified() == ekVar2.f34735f.lastModified() ? 0 : -1));
                if (i10 == 0) {
                    return 0;
                }
                if (i10 > 0) {
                    return -1;
                }
                return 1;
        }
    }
}
