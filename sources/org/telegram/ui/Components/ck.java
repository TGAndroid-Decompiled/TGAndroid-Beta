package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class ck implements Comparator {
    public final int f23349a;
    public final pk f23350b;

    public ck(pk pkVar, int i10) {
        this.f23349a = i10;
        this.f23350b = pkVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        jk jkVar = (jk) obj;
        jk jkVar2 = (jk) obj2;
        switch (this.f23349a) {
            case 0:
                pk pkVar = this.f23350b;
                pkVar.getClass();
                File file = jkVar.f25442f;
                if (file != null) {
                    if (jkVar2.f25442f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != jkVar2.f25442f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !pkVar.f27369c0) {
                            int i10 = (jkVar.f25442f.lastModified() > jkVar2.f25442f.lastModified() ? 1 : (jkVar.f25442f.lastModified() == jkVar2.f25442f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return jkVar.f25442f.getName().compareToIgnoreCase(jkVar2.f25442f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f23350b.f27369c0) {
                    return jkVar.f25442f.getName().compareToIgnoreCase(jkVar2.f25442f.getName());
                }
                int i11 = (jkVar.f25442f.lastModified() > jkVar2.f25442f.lastModified() ? 1 : (jkVar.f25442f.lastModified() == jkVar2.f25442f.lastModified() ? 0 : -1));
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
