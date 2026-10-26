package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class ak implements Comparator {
    public final int f26514a;
    public final nk f26515b;

    public ak(nk nkVar, int i10) {
        this.f26514a = i10;
        this.f26515b = nkVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        hk hkVar = (hk) obj;
        hk hkVar2 = (hk) obj2;
        switch (this.f26514a) {
            case 0:
                nk nkVar = this.f26515b;
                nkVar.getClass();
                File file = hkVar.f29005f;
                if (file != null) {
                    if (hkVar2.f29005f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != hkVar2.f29005f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !nkVar.f31029c0) {
                            int i10 = (hkVar.f29005f.lastModified() > hkVar2.f29005f.lastModified() ? 1 : (hkVar.f29005f.lastModified() == hkVar2.f29005f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return hkVar.f29005f.getName().compareToIgnoreCase(hkVar2.f29005f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f26515b.f31029c0) {
                    return hkVar.f29005f.getName().compareToIgnoreCase(hkVar2.f29005f.getName());
                }
                int i11 = (hkVar.f29005f.lastModified() > hkVar2.f29005f.lastModified() ? 1 : (hkVar.f29005f.lastModified() == hkVar2.f29005f.lastModified() ? 0 : -1));
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
