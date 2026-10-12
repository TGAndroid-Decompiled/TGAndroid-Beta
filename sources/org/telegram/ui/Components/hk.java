package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class hk implements Comparator {
    public final int f26802a;
    public final uk f26803b;

    public hk(uk ukVar, int i10) {
        this.f26802a = i10;
        this.f26803b = ukVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        ok okVar = (ok) obj;
        ok okVar2 = (ok) obj2;
        switch (this.f26802a) {
            case 0:
                uk ukVar = this.f26803b;
                ukVar.getClass();
                File file = okVar.f29228f;
                if (file != null) {
                    if (okVar2.f29228f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != okVar2.f29228f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !ukVar.f31189c0) {
                            int i10 = (okVar.f29228f.lastModified() > okVar2.f29228f.lastModified() ? 1 : (okVar.f29228f.lastModified() == okVar2.f29228f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return okVar.f29228f.getName().compareToIgnoreCase(okVar2.f29228f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f26803b.f31189c0) {
                    return okVar.f29228f.getName().compareToIgnoreCase(okVar2.f29228f.getName());
                }
                int i11 = (okVar.f29228f.lastModified() > okVar2.f29228f.lastModified() ? 1 : (okVar.f29228f.lastModified() == okVar2.f29228f.lastModified() ? 0 : -1));
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
