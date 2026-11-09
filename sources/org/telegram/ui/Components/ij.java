package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class ij implements Comparator {
    public final int f34764a;
    public final vj f34765b;

    public ij(vj vjVar, int i7) {
        this.f34764a = i7;
        this.f34765b = vjVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        pj pjVar = (pj) obj;
        pj pjVar2 = (pj) obj2;
        switch (this.f34764a) {
            case 0:
                vj vjVar = this.f34765b;
                vjVar.getClass();
                File file = pjVar.f37030f;
                if (file != null) {
                    if (pjVar2.f37030f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != pjVar2.f37030f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !vjVar.f39108c0) {
                            int i7 = (pjVar.f37030f.lastModified() > pjVar2.f37030f.lastModified() ? 1 : (pjVar.f37030f.lastModified() == pjVar2.f37030f.lastModified() ? 0 : -1));
                            if (i7 == 0) {
                                return 0;
                            }
                            if (i7 > 0) {
                            }
                        } else {
                            return pjVar.f37030f.getName().compareToIgnoreCase(pjVar2.f37030f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f34765b.f39108c0) {
                    return pjVar.f37030f.getName().compareToIgnoreCase(pjVar2.f37030f.getName());
                }
                int i10 = (pjVar.f37030f.lastModified() > pjVar2.f37030f.lastModified() ? 1 : (pjVar.f37030f.lastModified() == pjVar2.f37030f.lastModified() ? 0 : -1));
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
