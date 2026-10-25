package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class ak implements Comparator {
    public final int f26512a;
    public final nk f26513b;

    public ak(nk nkVar, int i10) {
        this.f26512a = i10;
        this.f26513b = nkVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        hk hkVar = (hk) obj;
        hk hkVar2 = (hk) obj2;
        switch (this.f26512a) {
            case 0:
                nk nkVar = this.f26513b;
                nkVar.getClass();
                File file = hkVar.f29003f;
                if (file != null) {
                    if (hkVar2.f29003f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != hkVar2.f29003f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !nkVar.f31027c0) {
                            int i10 = (hkVar.f29003f.lastModified() > hkVar2.f29003f.lastModified() ? 1 : (hkVar.f29003f.lastModified() == hkVar2.f29003f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return hkVar.f29003f.getName().compareToIgnoreCase(hkVar2.f29003f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f26513b.f31027c0) {
                    return hkVar.f29003f.getName().compareToIgnoreCase(hkVar2.f29003f.getName());
                }
                int i11 = (hkVar.f29003f.lastModified() > hkVar2.f29003f.lastModified() ? 1 : (hkVar.f29003f.lastModified() == hkVar2.f29003f.lastModified() ? 0 : -1));
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
