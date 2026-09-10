package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class ek implements Comparator {
    public final int f22719a;
    public final tk f22720b;

    public ek(tk tkVar, int i10) {
        this.f22719a = i10;
        this.f22720b = tkVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        nk nkVar = (nk) obj;
        nk nkVar2 = (nk) obj2;
        switch (this.f22719a) {
            case 0:
                tk tkVar = this.f22720b;
                tkVar.getClass();
                File file = nkVar.f25539f;
                if (file != null) {
                    if (nkVar2.f25539f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != nkVar2.f25539f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !tkVar.f27423c0) {
                            int i10 = (nkVar.f25539f.lastModified() > nkVar2.f25539f.lastModified() ? 1 : (nkVar.f25539f.lastModified() == nkVar2.f25539f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return nkVar.f25539f.getName().compareToIgnoreCase(nkVar2.f25539f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f22720b.f27423c0) {
                    return nkVar.f25539f.getName().compareToIgnoreCase(nkVar2.f25539f.getName());
                }
                int i11 = (nkVar.f25539f.lastModified() > nkVar2.f25539f.lastModified() ? 1 : (nkVar.f25539f.lastModified() == nkVar2.f25539f.lastModified() ? 0 : -1));
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
