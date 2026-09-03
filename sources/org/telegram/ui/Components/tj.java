package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class tj implements Comparator {
    public final int f28990a;
    public final hk f28991b;

    public tj(hk hkVar, int i10) {
        this.f28990a = i10;
        this.f28991b = hkVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        ak akVar = (ak) obj;
        ak akVar2 = (ak) obj2;
        switch (this.f28990a) {
            case 0:
                hk hkVar = this.f28991b;
                hkVar.getClass();
                File file = akVar.f23396f;
                if (file != null) {
                    if (akVar2.f23396f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != akVar2.f23396f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !hkVar.W) {
                            int i10 = (akVar.f23396f.lastModified() > akVar2.f23396f.lastModified() ? 1 : (akVar.f23396f.lastModified() == akVar2.f23396f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return akVar.f23396f.getName().compareToIgnoreCase(akVar2.f23396f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f28991b.W) {
                    return akVar.f23396f.getName().compareToIgnoreCase(akVar2.f23396f.getName());
                }
                int i11 = (akVar.f23396f.lastModified() > akVar2.f23396f.lastModified() ? 1 : (akVar.f23396f.lastModified() == akVar2.f23396f.lastModified() ? 0 : -1));
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
