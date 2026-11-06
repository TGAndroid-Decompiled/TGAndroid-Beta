package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class ij implements Comparator {
    public final int f34682a;
    public final vj f34683b;

    public ij(vj vjVar, int i7) {
        this.f34682a = i7;
        this.f34683b = vjVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        pj pjVar = (pj) obj;
        pj pjVar2 = (pj) obj2;
        switch (this.f34682a) {
            case 0:
                vj vjVar = this.f34683b;
                vjVar.getClass();
                File file = pjVar.f36926f;
                if (file != null) {
                    if (pjVar2.f36926f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != pjVar2.f36926f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !vjVar.f38980c0) {
                            int i7 = (pjVar.f36926f.lastModified() > pjVar2.f36926f.lastModified() ? 1 : (pjVar.f36926f.lastModified() == pjVar2.f36926f.lastModified() ? 0 : -1));
                            if (i7 == 0) {
                                return 0;
                            }
                            if (i7 > 0) {
                            }
                        } else {
                            return pjVar.f36926f.getName().compareToIgnoreCase(pjVar2.f36926f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f34683b.f38980c0) {
                    return pjVar.f36926f.getName().compareToIgnoreCase(pjVar2.f36926f.getName());
                }
                int i10 = (pjVar.f36926f.lastModified() > pjVar2.f36926f.lastModified() ? 1 : (pjVar.f36926f.lastModified() == pjVar2.f36926f.lastModified() ? 0 : -1));
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
