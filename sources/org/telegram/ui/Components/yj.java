package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class yj implements Comparator {
    public final int f42439a;
    public final mk f42440b;

    public yj(mk mkVar, int i7) {
        this.f42439a = i7;
        this.f42440b = mkVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        fk fkVar = (fk) obj;
        fk fkVar2 = (fk) obj2;
        switch (this.f42439a) {
            case 0:
                mk mkVar = this.f42440b;
                mkVar.getClass();
                File file = fkVar.f35250f;
                if (file != null) {
                    if (fkVar2.f35250f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != fkVar2.f35250f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !mkVar.f37530d0) {
                            int i7 = (fkVar.f35250f.lastModified() > fkVar2.f35250f.lastModified() ? 1 : (fkVar.f35250f.lastModified() == fkVar2.f35250f.lastModified() ? 0 : -1));
                            if (i7 == 0) {
                                return 0;
                            }
                            if (i7 > 0) {
                            }
                        } else {
                            return fkVar.f35250f.getName().compareToIgnoreCase(fkVar2.f35250f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f42440b.f37530d0) {
                    return fkVar.f35250f.getName().compareToIgnoreCase(fkVar2.f35250f.getName());
                }
                int i10 = (fkVar.f35250f.lastModified() > fkVar2.f35250f.lastModified() ? 1 : (fkVar.f35250f.lastModified() == fkVar2.f35250f.lastModified() ? 0 : -1));
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
