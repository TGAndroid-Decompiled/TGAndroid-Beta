package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class dk implements Comparator {
    public final int f23677a;
    public final qk f23678b;

    public dk(qk qkVar, int i10) {
        this.f23677a = i10;
        this.f23678b = qkVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        kk kkVar = (kk) obj;
        kk kkVar2 = (kk) obj2;
        switch (this.f23677a) {
            case 0:
                qk qkVar = this.f23678b;
                qkVar.getClass();
                File file = kkVar.f25783f;
                if (file != null) {
                    if (kkVar2.f25783f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != kkVar2.f25783f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !qkVar.f27757c0) {
                            int i10 = (kkVar.f25783f.lastModified() > kkVar2.f25783f.lastModified() ? 1 : (kkVar.f25783f.lastModified() == kkVar2.f25783f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return kkVar.f25783f.getName().compareToIgnoreCase(kkVar2.f25783f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f23678b.f27757c0) {
                    return kkVar.f25783f.getName().compareToIgnoreCase(kkVar2.f25783f.getName());
                }
                int i11 = (kkVar.f25783f.lastModified() > kkVar2.f25783f.lastModified() ? 1 : (kkVar.f25783f.lastModified() == kkVar2.f25783f.lastModified() ? 0 : -1));
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
