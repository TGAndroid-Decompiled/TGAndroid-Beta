package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class fk implements Comparator {
    public final int f26428a;
    public final sk f26429b;

    public fk(sk skVar, int i10) {
        this.f26428a = i10;
        this.f26429b = skVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        mk mkVar = (mk) obj;
        mk mkVar2 = (mk) obj2;
        switch (this.f26428a) {
            case 0:
                sk skVar = this.f26429b;
                skVar.getClass();
                File file = mkVar.f28829f;
                if (file != null) {
                    if (mkVar2.f28829f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != mkVar2.f28829f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !skVar.f30805c0) {
                            int i10 = (mkVar.f28829f.lastModified() > mkVar2.f28829f.lastModified() ? 1 : (mkVar.f28829f.lastModified() == mkVar2.f28829f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return mkVar.f28829f.getName().compareToIgnoreCase(mkVar2.f28829f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f26429b.f30805c0) {
                    return mkVar.f28829f.getName().compareToIgnoreCase(mkVar2.f28829f.getName());
                }
                int i11 = (mkVar.f28829f.lastModified() > mkVar2.f28829f.lastModified() ? 1 : (mkVar.f28829f.lastModified() == mkVar2.f28829f.lastModified() ? 0 : -1));
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
