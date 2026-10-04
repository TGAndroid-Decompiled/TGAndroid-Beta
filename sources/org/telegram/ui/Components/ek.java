package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class ek implements Comparator {
    public final int f26075a;
    public final rk f26076b;

    public ek(rk rkVar, int i10) {
        this.f26075a = i10;
        this.f26076b = rkVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        lk lkVar = (lk) obj;
        lk lkVar2 = (lk) obj2;
        switch (this.f26075a) {
            case 0:
                rk rkVar = this.f26076b;
                rkVar.getClass();
                File file = lkVar.f28389f;
                if (file != null) {
                    if (lkVar2.f28389f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != lkVar2.f28389f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !rkVar.f30428c0) {
                            int i10 = (lkVar.f28389f.lastModified() > lkVar2.f28389f.lastModified() ? 1 : (lkVar.f28389f.lastModified() == lkVar2.f28389f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return lkVar.f28389f.getName().compareToIgnoreCase(lkVar2.f28389f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f26076b.f30428c0) {
                    return lkVar.f28389f.getName().compareToIgnoreCase(lkVar2.f28389f.getName());
                }
                int i11 = (lkVar.f28389f.lastModified() > lkVar2.f28389f.lastModified() ? 1 : (lkVar.f28389f.lastModified() == lkVar2.f28389f.lastModified() ? 0 : -1));
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
