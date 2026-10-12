package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class hk implements Comparator {
    public final int f26788a;
    public final uk f26789b;

    public hk(uk ukVar, int i10) {
        this.f26788a = i10;
        this.f26789b = ukVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        ok okVar = (ok) obj;
        ok okVar2 = (ok) obj2;
        switch (this.f26788a) {
            case 0:
                uk ukVar = this.f26789b;
                ukVar.getClass();
                File file = okVar.f29231f;
                if (file != null) {
                    if (okVar2.f29231f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != okVar2.f29231f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !ukVar.f31181c0) {
                            int i10 = (okVar.f29231f.lastModified() > okVar2.f29231f.lastModified() ? 1 : (okVar.f29231f.lastModified() == okVar2.f29231f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return okVar.f29231f.getName().compareToIgnoreCase(okVar2.f29231f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f26789b.f31181c0) {
                    return okVar.f29231f.getName().compareToIgnoreCase(okVar2.f29231f.getName());
                }
                int i11 = (okVar.f29231f.lastModified() > okVar2.f29231f.lastModified() ? 1 : (okVar.f29231f.lastModified() == okVar2.f29231f.lastModified() ? 0 : -1));
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
