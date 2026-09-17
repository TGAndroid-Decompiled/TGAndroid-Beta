package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class bk implements Comparator {
    public final int f24769a;
    public final ok f24770b;

    public bk(ok okVar, int i10) {
        this.f24769a = i10;
        this.f24770b = okVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        ik ikVar = (ik) obj;
        ik ikVar2 = (ik) obj2;
        switch (this.f24769a) {
            case 0:
                ok okVar = this.f24770b;
                okVar.getClass();
                File file = ikVar.f27183f;
                if (file != null) {
                    if (ikVar2.f27183f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != ikVar2.f27183f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !okVar.f29115c0) {
                            int i10 = (ikVar.f27183f.lastModified() > ikVar2.f27183f.lastModified() ? 1 : (ikVar.f27183f.lastModified() == ikVar2.f27183f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return ikVar.f27183f.getName().compareToIgnoreCase(ikVar2.f27183f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f24770b.f29115c0) {
                    return ikVar.f27183f.getName().compareToIgnoreCase(ikVar2.f27183f.getName());
                }
                int i11 = (ikVar.f27183f.lastModified() > ikVar2.f27183f.lastModified() ? 1 : (ikVar.f27183f.lastModified() == ikVar2.f27183f.lastModified() ? 0 : -1));
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
