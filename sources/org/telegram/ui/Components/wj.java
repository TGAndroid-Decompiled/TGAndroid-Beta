package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class wj implements Comparator {
    public final int f41720a;
    public final kk f41721b;

    public wj(kk kkVar, int i7) {
        this.f41720a = i7;
        this.f41721b = kkVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        dk dkVar = (dk) obj;
        dk dkVar2 = (dk) obj2;
        switch (this.f41720a) {
            case 0:
                kk kkVar = this.f41721b;
                kkVar.getClass();
                File file = dkVar.f34456f;
                if (file != null) {
                    if (dkVar2.f34456f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != dkVar2.f34456f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !kkVar.f36776d0) {
                            int i7 = (dkVar.f34456f.lastModified() > dkVar2.f34456f.lastModified() ? 1 : (dkVar.f34456f.lastModified() == dkVar2.f34456f.lastModified() ? 0 : -1));
                            if (i7 == 0) {
                                return 0;
                            }
                            if (i7 > 0) {
                            }
                        } else {
                            return dkVar.f34456f.getName().compareToIgnoreCase(dkVar2.f34456f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f41721b.f36776d0) {
                    return dkVar.f34456f.getName().compareToIgnoreCase(dkVar2.f34456f.getName());
                }
                int i10 = (dkVar.f34456f.lastModified() > dkVar2.f34456f.lastModified() ? 1 : (dkVar.f34456f.lastModified() == dkVar2.f34456f.lastModified() ? 0 : -1));
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
