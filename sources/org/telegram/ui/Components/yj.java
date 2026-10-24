package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class yj implements Comparator {
    public final int f32939a;
    public final lk f32940b;

    public yj(lk lkVar, int i10) {
        this.f32939a = i10;
        this.f32940b = lkVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        fk fkVar = (fk) obj;
        fk fkVar2 = (fk) obj2;
        switch (this.f32939a) {
            case 0:
                lk lkVar = this.f32940b;
                lkVar.getClass();
                File file = fkVar.f26335f;
                if (file != null) {
                    if (fkVar2.f26335f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != fkVar2.f26335f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !lkVar.f28353c0) {
                            int i10 = (fkVar.f26335f.lastModified() > fkVar2.f26335f.lastModified() ? 1 : (fkVar.f26335f.lastModified() == fkVar2.f26335f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return fkVar.f26335f.getName().compareToIgnoreCase(fkVar2.f26335f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f32940b.f28353c0) {
                    return fkVar.f26335f.getName().compareToIgnoreCase(fkVar2.f26335f.getName());
                }
                int i11 = (fkVar.f26335f.lastModified() > fkVar2.f26335f.lastModified() ? 1 : (fkVar.f26335f.lastModified() == fkVar2.f26335f.lastModified() ? 0 : -1));
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
