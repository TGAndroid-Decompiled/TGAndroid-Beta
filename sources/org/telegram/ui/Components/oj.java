package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;

public final class oj implements Comparator {

    public final int f31341a;

    public final bk f31342b;

    public oj(bk bkVar, int i10) {
        this.f31341a = i10;
        this.f31342b = bkVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        vj vjVar = (vj) obj;
        vj vjVar2 = (vj) obj2;
        switch (this.f31341a) {
            case 0:
                bk bkVar = this.f31342b;
                bkVar.getClass();
                File file = vjVar.f33431f;
                if (file != null) {
                    if (vjVar2.f33431f != null) {
                        boolean zIsDirectory = file.isDirectory();
                        if (zIsDirectory != vjVar2.f33431f.isDirectory()) {
                            if (zIsDirectory) {
                            }
                        } else {
                            if (zIsDirectory || bkVar.V) {
                                return vjVar.f33431f.getName().compareToIgnoreCase(vjVar2.f33431f.getName());
                            }
                            long jLastModified = vjVar.f33431f.lastModified();
                            long jLastModified2 = vjVar2.f33431f.lastModified();
                            if (jLastModified == jLastModified2) {
                                return 0;
                            }
                            if (jLastModified > jLastModified2) {
                            }
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f31342b.V) {
                    return vjVar.f33431f.getName().compareToIgnoreCase(vjVar2.f33431f.getName());
                }
                long jLastModified3 = vjVar.f33431f.lastModified();
                long jLastModified4 = vjVar2.f33431f.lastModified();
                if (jLastModified3 == jLastModified4) {
                    return 0;
                }
                return jLastModified3 > jLastModified4 ? -1 : 1;
        }
    }
}
