package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class tj implements Comparator {
    public final int f28985a;
    public final hk f28986b;

    public tj(hk hkVar, int i10) {
        this.f28985a = i10;
        this.f28986b = hkVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        ak akVar = (ak) obj;
        ak akVar2 = (ak) obj2;
        switch (this.f28985a) {
            case 0:
                hk hkVar = this.f28986b;
                hkVar.getClass();
                File file = akVar.f23415f;
                if (file != null) {
                    if (akVar2.f23415f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != akVar2.f23415f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !hkVar.W) {
                            int i10 = (akVar.f23415f.lastModified() > akVar2.f23415f.lastModified() ? 1 : (akVar.f23415f.lastModified() == akVar2.f23415f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return akVar.f23415f.getName().compareToIgnoreCase(akVar2.f23415f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f28986b.W) {
                    return akVar.f23415f.getName().compareToIgnoreCase(akVar2.f23415f.getName());
                }
                int i11 = (akVar.f23415f.lastModified() > akVar2.f23415f.lastModified() ? 1 : (akVar.f23415f.lastModified() == akVar2.f23415f.lastModified() ? 0 : -1));
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
