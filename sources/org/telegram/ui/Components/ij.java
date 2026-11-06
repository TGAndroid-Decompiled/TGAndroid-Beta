package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class ij implements Comparator {
    public final int f34652a;
    public final vj f34653b;

    public ij(vj vjVar, int i7) {
        this.f34652a = i7;
        this.f34653b = vjVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        pj pjVar = (pj) obj;
        pj pjVar2 = (pj) obj2;
        switch (this.f34652a) {
            case 0:
                vj vjVar = this.f34653b;
                vjVar.getClass();
                File file = pjVar.f36910f;
                if (file != null) {
                    if (pjVar2.f36910f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != pjVar2.f36910f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !vjVar.f38959c0) {
                            int i7 = (pjVar.f36910f.lastModified() > pjVar2.f36910f.lastModified() ? 1 : (pjVar.f36910f.lastModified() == pjVar2.f36910f.lastModified() ? 0 : -1));
                            if (i7 == 0) {
                                return 0;
                            }
                            if (i7 > 0) {
                            }
                        } else {
                            return pjVar.f36910f.getName().compareToIgnoreCase(pjVar2.f36910f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f34653b.f38959c0) {
                    return pjVar.f36910f.getName().compareToIgnoreCase(pjVar2.f36910f.getName());
                }
                int i10 = (pjVar.f36910f.lastModified() > pjVar2.f36910f.lastModified() ? 1 : (pjVar.f36910f.lastModified() == pjVar2.f36910f.lastModified() ? 0 : -1));
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
