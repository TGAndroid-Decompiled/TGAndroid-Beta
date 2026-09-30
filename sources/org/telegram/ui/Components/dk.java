package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class dk implements Comparator {
    public final int f23660a;
    public final qk f23661b;

    public dk(qk qkVar, int i10) {
        this.f23660a = i10;
        this.f23661b = qkVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        kk kkVar = (kk) obj;
        kk kkVar2 = (kk) obj2;
        switch (this.f23660a) {
            case 0:
                qk qkVar = this.f23661b;
                qkVar.getClass();
                File file = kkVar.f25753f;
                if (file != null) {
                    if (kkVar2.f25753f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != kkVar2.f25753f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !qkVar.f27735c0) {
                            int i10 = (kkVar.f25753f.lastModified() > kkVar2.f25753f.lastModified() ? 1 : (kkVar.f25753f.lastModified() == kkVar2.f25753f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return kkVar.f25753f.getName().compareToIgnoreCase(kkVar2.f25753f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f23661b.f27735c0) {
                    return kkVar.f25753f.getName().compareToIgnoreCase(kkVar2.f25753f.getName());
                }
                int i11 = (kkVar.f25753f.lastModified() > kkVar2.f25753f.lastModified() ? 1 : (kkVar.f25753f.lastModified() == kkVar2.f25753f.lastModified() ? 0 : -1));
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
