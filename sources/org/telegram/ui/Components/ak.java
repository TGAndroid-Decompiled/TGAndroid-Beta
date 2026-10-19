package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class ak implements Comparator {
    public final int f24594a;
    public final nk f24595b;

    public ak(nk nkVar, int i10) {
        this.f24594a = i10;
        this.f24595b = nkVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        hk hkVar = (hk) obj;
        hk hkVar2 = (hk) obj2;
        switch (this.f24594a) {
            case 0:
                nk nkVar = this.f24595b;
                nkVar.getClass();
                File file = hkVar.f26892f;
                if (file != null) {
                    if (hkVar2.f26892f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != hkVar2.f26892f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !nkVar.f28787c0) {
                            int i10 = (hkVar.f26892f.lastModified() > hkVar2.f26892f.lastModified() ? 1 : (hkVar.f26892f.lastModified() == hkVar2.f26892f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return hkVar.f26892f.getName().compareToIgnoreCase(hkVar2.f26892f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f24595b.f28787c0) {
                    return hkVar.f26892f.getName().compareToIgnoreCase(hkVar2.f26892f.getName());
                }
                int i11 = (hkVar.f26892f.lastModified() > hkVar2.f26892f.lastModified() ? 1 : (hkVar.f26892f.lastModified() == hkVar2.f26892f.lastModified() ? 0 : -1));
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
