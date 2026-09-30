package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class ek implements Comparator {
    public final int f23995a;
    public final rk f23996b;

    public ek(rk rkVar, int i10) {
        this.f23995a = i10;
        this.f23996b = rkVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        lk lkVar = (lk) obj;
        lk lkVar2 = (lk) obj2;
        switch (this.f23995a) {
            case 0:
                rk rkVar = this.f23996b;
                rkVar.getClass();
                File file = lkVar.f26045f;
                if (file != null) {
                    if (lkVar2.f26045f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != lkVar2.f26045f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !rkVar.f28040c0) {
                            int i10 = (lkVar.f26045f.lastModified() > lkVar2.f26045f.lastModified() ? 1 : (lkVar.f26045f.lastModified() == lkVar2.f26045f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return lkVar.f26045f.getName().compareToIgnoreCase(lkVar2.f26045f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f23996b.f28040c0) {
                    return lkVar.f26045f.getName().compareToIgnoreCase(lkVar2.f26045f.getName());
                }
                int i11 = (lkVar.f26045f.lastModified() > lkVar2.f26045f.lastModified() ? 1 : (lkVar.f26045f.lastModified() == lkVar2.f26045f.lastModified() ? 0 : -1));
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
