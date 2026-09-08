package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class bk implements Comparator {
    public final int f24768a;
    public final ok f24769b;

    public bk(ok okVar, int i10) {
        this.f24768a = i10;
        this.f24769b = okVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        ik ikVar = (ik) obj;
        ik ikVar2 = (ik) obj2;
        switch (this.f24768a) {
            case 0:
                ok okVar = this.f24769b;
                okVar.getClass();
                File file = ikVar.f27182f;
                if (file != null) {
                    if (ikVar2.f27182f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != ikVar2.f27182f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !okVar.f29114c0) {
                            int i10 = (ikVar.f27182f.lastModified() > ikVar2.f27182f.lastModified() ? 1 : (ikVar.f27182f.lastModified() == ikVar2.f27182f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return ikVar.f27182f.getName().compareToIgnoreCase(ikVar2.f27182f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f24769b.f29114c0) {
                    return ikVar.f27182f.getName().compareToIgnoreCase(ikVar2.f27182f.getName());
                }
                int i11 = (ikVar.f27182f.lastModified() > ikVar2.f27182f.lastModified() ? 1 : (ikVar.f27182f.lastModified() == ikVar2.f27182f.lastModified() ? 0 : -1));
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
