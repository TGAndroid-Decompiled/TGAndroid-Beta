package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class fk implements Comparator {
    public final int f26395a;
    public final sk f26396b;

    public fk(sk skVar, int i10) {
        this.f26395a = i10;
        this.f26396b = skVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        mk mkVar = (mk) obj;
        mk mkVar2 = (mk) obj2;
        switch (this.f26395a) {
            case 0:
                sk skVar = this.f26396b;
                skVar.getClass();
                File file = mkVar.f28850f;
                if (file != null) {
                    if (mkVar2.f28850f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != mkVar2.f28850f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !skVar.f30832c0) {
                            int i10 = (mkVar.f28850f.lastModified() > mkVar2.f28850f.lastModified() ? 1 : (mkVar.f28850f.lastModified() == mkVar2.f28850f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return mkVar.f28850f.getName().compareToIgnoreCase(mkVar2.f28850f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f26396b.f30832c0) {
                    return mkVar.f28850f.getName().compareToIgnoreCase(mkVar2.f28850f.getName());
                }
                int i11 = (mkVar.f28850f.lastModified() > mkVar2.f28850f.lastModified() ? 1 : (mkVar.f28850f.lastModified() == mkVar2.f28850f.lastModified() ? 0 : -1));
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
