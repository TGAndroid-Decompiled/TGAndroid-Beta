package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class hj implements Comparator {
    public final int f34364a;
    public final uj f34365b;

    public hj(uj ujVar, int i7) {
        this.f34364a = i7;
        this.f34365b = ujVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        oj ojVar = (oj) obj;
        oj ojVar2 = (oj) obj2;
        switch (this.f34364a) {
            case 0:
                uj ujVar = this.f34365b;
                ujVar.getClass();
                File file = ojVar.f36624f;
                if (file != null) {
                    if (ojVar2.f36624f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != ojVar2.f36624f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !ujVar.f38693c0) {
                            int i7 = (ojVar.f36624f.lastModified() > ojVar2.f36624f.lastModified() ? 1 : (ojVar.f36624f.lastModified() == ojVar2.f36624f.lastModified() ? 0 : -1));
                            if (i7 == 0) {
                                return 0;
                            }
                            if (i7 > 0) {
                            }
                        } else {
                            return ojVar.f36624f.getName().compareToIgnoreCase(ojVar2.f36624f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f34365b.f38693c0) {
                    return ojVar.f36624f.getName().compareToIgnoreCase(ojVar2.f36624f.getName());
                }
                int i10 = (ojVar.f36624f.lastModified() > ojVar2.f36624f.lastModified() ? 1 : (ojVar.f36624f.lastModified() == ojVar2.f36624f.lastModified() ? 0 : -1));
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
