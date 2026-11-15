package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class pj implements Comparator {
    public final int f38315a;
    public final dk f38316b;

    public pj(dk dkVar, int i7) {
        this.f38315a = i7;
        this.f38316b = dkVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        wj wjVar = (wj) obj;
        wj wjVar2 = (wj) obj2;
        switch (this.f38315a) {
            case 0:
                dk dkVar = this.f38316b;
                dkVar.getClass();
                File file = wjVar.f41366f;
                if (file != null) {
                    if (wjVar2.f41366f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != wjVar2.f41366f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !dkVar.f33960d0) {
                            int i7 = (wjVar.f41366f.lastModified() > wjVar2.f41366f.lastModified() ? 1 : (wjVar.f41366f.lastModified() == wjVar2.f41366f.lastModified() ? 0 : -1));
                            if (i7 == 0) {
                                return 0;
                            }
                            if (i7 > 0) {
                            }
                        } else {
                            return wjVar.f41366f.getName().compareToIgnoreCase(wjVar2.f41366f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f38316b.f33960d0) {
                    return wjVar.f41366f.getName().compareToIgnoreCase(wjVar2.f41366f.getName());
                }
                int i10 = (wjVar.f41366f.lastModified() > wjVar2.f41366f.lastModified() ? 1 : (wjVar.f41366f.lastModified() == wjVar2.f41366f.lastModified() ? 0 : -1));
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
