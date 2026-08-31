package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class vj implements Comparator {
    public final int f31918a;
    public final jk f31919b;

    public vj(jk jkVar, int i10) {
        this.f31918a = i10;
        this.f31919b = jkVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        ck ckVar = (ck) obj;
        ck ckVar2 = (ck) obj2;
        switch (this.f31918a) {
            case 0:
                jk jkVar = this.f31919b;
                jkVar.getClass();
                File file = ckVar.f25993f;
                if (file != null) {
                    if (ckVar2.f25993f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != ckVar2.f25993f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !jkVar.W) {
                            int i10 = (ckVar.f25993f.lastModified() > ckVar2.f25993f.lastModified() ? 1 : (ckVar.f25993f.lastModified() == ckVar2.f25993f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return ckVar.f25993f.getName().compareToIgnoreCase(ckVar2.f25993f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f31919b.W) {
                    return ckVar.f25993f.getName().compareToIgnoreCase(ckVar2.f25993f.getName());
                }
                int i11 = (ckVar.f25993f.lastModified() > ckVar2.f25993f.lastModified() ? 1 : (ckVar.f25993f.lastModified() == ckVar2.f25993f.lastModified() ? 0 : -1));
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
