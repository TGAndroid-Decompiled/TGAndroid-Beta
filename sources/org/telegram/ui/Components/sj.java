package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class sj implements Comparator {
    public final int f32472a;
    public final fk f32473b;

    public sj(fk fkVar, int i9) {
        this.f32472a = i9;
        this.f32473b = fkVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        zj zjVar = (zj) obj;
        zj zjVar2 = (zj) obj2;
        switch (this.f32472a) {
            case 0:
                fk fkVar = this.f32473b;
                fkVar.getClass();
                File file = zjVar.f35321f;
                if (file != null) {
                    if (zjVar2.f35321f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != zjVar2.f35321f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !fkVar.V) {
                            int i9 = (zjVar.f35321f.lastModified() > zjVar2.f35321f.lastModified() ? 1 : (zjVar.f35321f.lastModified() == zjVar2.f35321f.lastModified() ? 0 : -1));
                            if (i9 == 0) {
                                return 0;
                            }
                            if (i9 > 0) {
                            }
                        } else {
                            return zjVar.f35321f.getName().compareToIgnoreCase(zjVar2.f35321f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f32473b.V) {
                    return zjVar.f35321f.getName().compareToIgnoreCase(zjVar2.f35321f.getName());
                }
                int i10 = (zjVar.f35321f.lastModified() > zjVar2.f35321f.lastModified() ? 1 : (zjVar.f35321f.lastModified() == zjVar2.f35321f.lastModified() ? 0 : -1));
                if (i10 == 0) {
                    return 0;
                }
                if (i10 > 0) {
                    return -1;
                }
                return 1;
        }
    }
}
