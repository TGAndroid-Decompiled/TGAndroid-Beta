package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class dk implements Comparator {
    public final int f23676a;
    public final qk f23677b;

    public dk(qk qkVar, int i10) {
        this.f23676a = i10;
        this.f23677b = qkVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        kk kkVar = (kk) obj;
        kk kkVar2 = (kk) obj2;
        switch (this.f23676a) {
            case 0:
                qk qkVar = this.f23677b;
                qkVar.getClass();
                File file = kkVar.f25754f;
                if (file != null) {
                    if (kkVar2.f25754f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != kkVar2.f25754f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !qkVar.f27744c0) {
                            int i10 = (kkVar.f25754f.lastModified() > kkVar2.f25754f.lastModified() ? 1 : (kkVar.f25754f.lastModified() == kkVar2.f25754f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return kkVar.f25754f.getName().compareToIgnoreCase(kkVar2.f25754f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f23677b.f27744c0) {
                    return kkVar.f25754f.getName().compareToIgnoreCase(kkVar2.f25754f.getName());
                }
                int i11 = (kkVar.f25754f.lastModified() > kkVar2.f25754f.lastModified() ? 1 : (kkVar.f25754f.lastModified() == kkVar2.f25754f.lastModified() ? 0 : -1));
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
