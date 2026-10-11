package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class fk implements Comparator {
    public final int f26366a;
    public final sk f26367b;

    public fk(sk skVar, int i10) {
        this.f26366a = i10;
        this.f26367b = skVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        mk mkVar = (mk) obj;
        mk mkVar2 = (mk) obj2;
        switch (this.f26366a) {
            case 0:
                sk skVar = this.f26367b;
                skVar.getClass();
                File file = mkVar.f28736f;
                if (file != null) {
                    if (mkVar2.f28736f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != mkVar2.f28736f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !skVar.f30764c0) {
                            int i10 = (mkVar.f28736f.lastModified() > mkVar2.f28736f.lastModified() ? 1 : (mkVar.f28736f.lastModified() == mkVar2.f28736f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return mkVar.f28736f.getName().compareToIgnoreCase(mkVar2.f28736f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f26367b.f30764c0) {
                    return mkVar.f28736f.getName().compareToIgnoreCase(mkVar2.f28736f.getName());
                }
                int i11 = (mkVar.f28736f.lastModified() > mkVar2.f28736f.lastModified() ? 1 : (mkVar.f28736f.lastModified() == mkVar2.f28736f.lastModified() ? 0 : -1));
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
