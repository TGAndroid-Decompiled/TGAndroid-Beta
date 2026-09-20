package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class bk implements Comparator {
    public final int f23009a;
    public final ok f23010b;

    public bk(ok okVar, int i10) {
        this.f23009a = i10;
        this.f23010b = okVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        ik ikVar = (ik) obj;
        ik ikVar2 = (ik) obj2;
        switch (this.f23009a) {
            case 0:
                ok okVar = this.f23010b;
                okVar.getClass();
                File file = ikVar.f25068f;
                if (file != null) {
                    if (ikVar2.f25068f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != ikVar2.f25068f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !okVar.f26960c0) {
                            int i10 = (ikVar.f25068f.lastModified() > ikVar2.f25068f.lastModified() ? 1 : (ikVar.f25068f.lastModified() == ikVar2.f25068f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return ikVar.f25068f.getName().compareToIgnoreCase(ikVar2.f25068f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f23010b.f26960c0) {
                    return ikVar.f25068f.getName().compareToIgnoreCase(ikVar2.f25068f.getName());
                }
                int i11 = (ikVar.f25068f.lastModified() > ikVar2.f25068f.lastModified() ? 1 : (ikVar.f25068f.lastModified() == ikVar2.f25068f.lastModified() ? 0 : -1));
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
