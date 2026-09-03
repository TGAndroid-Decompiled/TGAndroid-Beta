package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class vj implements Comparator {
    public final int f31896a;
    public final jk f31897b;

    public vj(jk jkVar, int i10) {
        this.f31896a = i10;
        this.f31897b = jkVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        ck ckVar = (ck) obj;
        ck ckVar2 = (ck) obj2;
        switch (this.f31896a) {
            case 0:
                jk jkVar = this.f31897b;
                jkVar.getClass();
                File file = ckVar.f25970f;
                if (file != null) {
                    if (ckVar2.f25970f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != ckVar2.f25970f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !jkVar.W) {
                            int i10 = (ckVar.f25970f.lastModified() > ckVar2.f25970f.lastModified() ? 1 : (ckVar.f25970f.lastModified() == ckVar2.f25970f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return ckVar.f25970f.getName().compareToIgnoreCase(ckVar2.f25970f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f31897b.W) {
                    return ckVar.f25970f.getName().compareToIgnoreCase(ckVar2.f25970f.getName());
                }
                int i11 = (ckVar.f25970f.lastModified() > ckVar2.f25970f.lastModified() ? 1 : (ckVar.f25970f.lastModified() == ckVar2.f25970f.lastModified() ? 0 : -1));
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
