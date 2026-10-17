package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class ak implements Comparator {
    public final int f24612a;
    public final nk f24613b;

    public ak(nk nkVar, int i10) {
        this.f24612a = i10;
        this.f24613b = nkVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        hk hkVar = (hk) obj;
        hk hkVar2 = (hk) obj2;
        switch (this.f24612a) {
            case 0:
                nk nkVar = this.f24613b;
                nkVar.getClass();
                File file = hkVar.f26897f;
                if (file != null) {
                    if (hkVar2.f26897f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != hkVar2.f26897f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !nkVar.f28769c0) {
                            int i10 = (hkVar.f26897f.lastModified() > hkVar2.f26897f.lastModified() ? 1 : (hkVar.f26897f.lastModified() == hkVar2.f26897f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return hkVar.f26897f.getName().compareToIgnoreCase(hkVar2.f26897f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f24613b.f28769c0) {
                    return hkVar.f26897f.getName().compareToIgnoreCase(hkVar2.f26897f.getName());
                }
                int i11 = (hkVar.f26897f.lastModified() > hkVar2.f26897f.lastModified() ? 1 : (hkVar.f26897f.lastModified() == hkVar2.f26897f.lastModified() ? 0 : -1));
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
