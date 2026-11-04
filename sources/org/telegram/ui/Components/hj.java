package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class hj implements Comparator {
    public final int f34402a;
    public final uj f34403b;

    public hj(uj ujVar, int i3) {
        this.f34402a = i3;
        this.f34403b = ujVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        oj ojVar = (oj) obj;
        oj ojVar2 = (oj) obj2;
        switch (this.f34402a) {
            case 0:
                uj ujVar = this.f34403b;
                ujVar.getClass();
                File file = ojVar.f36843f;
                if (file != null) {
                    if (ojVar2.f36843f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != ojVar2.f36843f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !ujVar.f38765d0) {
                            int i3 = (ojVar.f36843f.lastModified() > ojVar2.f36843f.lastModified() ? 1 : (ojVar.f36843f.lastModified() == ojVar2.f36843f.lastModified() ? 0 : -1));
                            if (i3 == 0) {
                                return 0;
                            }
                            if (i3 > 0) {
                            }
                        } else {
                            return ojVar.f36843f.getName().compareToIgnoreCase(ojVar2.f36843f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f34403b.f38765d0) {
                    return ojVar.f36843f.getName().compareToIgnoreCase(ojVar2.f36843f.getName());
                }
                int i10 = (ojVar.f36843f.lastModified() > ojVar2.f36843f.lastModified() ? 1 : (ojVar.f36843f.lastModified() == ojVar2.f36843f.lastModified() ? 0 : -1));
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
