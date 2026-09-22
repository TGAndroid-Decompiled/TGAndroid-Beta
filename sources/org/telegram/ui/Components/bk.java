package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class bk implements Comparator {
    public final int f23026a;
    public final ok f23027b;

    public bk(ok okVar, int i10) {
        this.f23026a = i10;
        this.f23027b = okVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        ik ikVar = (ik) obj;
        ik ikVar2 = (ik) obj2;
        switch (this.f23026a) {
            case 0:
                ok okVar = this.f23027b;
                okVar.getClass();
                File file = ikVar.f25150f;
                if (file != null) {
                    if (ikVar2.f25150f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != ikVar2.f25150f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !okVar.f27112c0) {
                            int i10 = (ikVar.f25150f.lastModified() > ikVar2.f25150f.lastModified() ? 1 : (ikVar.f25150f.lastModified() == ikVar2.f25150f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return ikVar.f25150f.getName().compareToIgnoreCase(ikVar2.f25150f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f23027b.f27112c0) {
                    return ikVar.f25150f.getName().compareToIgnoreCase(ikVar2.f25150f.getName());
                }
                int i11 = (ikVar.f25150f.lastModified() > ikVar2.f25150f.lastModified() ? 1 : (ikVar.f25150f.lastModified() == ikVar2.f25150f.lastModified() ? 0 : -1));
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
