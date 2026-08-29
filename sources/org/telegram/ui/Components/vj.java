package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class vj implements Comparator {
    public final int f33565a;
    public final jk f33566b;

    public vj(jk jkVar, int i10) {
        this.f33565a = i10;
        this.f33566b = jkVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        ck ckVar = (ck) obj;
        ck ckVar2 = (ck) obj2;
        switch (this.f33565a) {
            case 0:
                jk jkVar = this.f33566b;
                jkVar.getClass();
                File file = ckVar.f27500f;
                if (file != null) {
                    if (ckVar2.f27500f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != ckVar2.f27500f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !jkVar.V) {
                            int i10 = (ckVar.f27500f.lastModified() > ckVar2.f27500f.lastModified() ? 1 : (ckVar.f27500f.lastModified() == ckVar2.f27500f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return ckVar.f27500f.getName().compareToIgnoreCase(ckVar2.f27500f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f33566b.V) {
                    return ckVar.f27500f.getName().compareToIgnoreCase(ckVar2.f27500f.getName());
                }
                int i11 = (ckVar.f27500f.lastModified() > ckVar2.f27500f.lastModified() ? 1 : (ckVar.f27500f.lastModified() == ckVar2.f27500f.lastModified() ? 0 : -1));
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
