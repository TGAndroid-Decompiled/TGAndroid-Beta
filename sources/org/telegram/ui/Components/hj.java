package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class hj implements Comparator {
    public final int f26807a;
    public final xj f26808b;

    public hj(xj xjVar, int i10) {
        this.f26807a = i10;
        this.f26808b = xjVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        qj qjVar = (qj) obj;
        qj qjVar2 = (qj) obj2;
        switch (this.f26807a) {
            case 0:
                xj xjVar = this.f26808b;
                xjVar.getClass();
                File file = qjVar.f29744f;
                if (file != null) {
                    if (qjVar2.f29744f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != qjVar2.f29744f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !xjVar.f32582c0) {
                            int i10 = (qjVar.f29744f.lastModified() > qjVar2.f29744f.lastModified() ? 1 : (qjVar.f29744f.lastModified() == qjVar2.f29744f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return qjVar.f29744f.getName().compareToIgnoreCase(qjVar2.f29744f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f26808b.f32582c0) {
                    return qjVar.f29744f.getName().compareToIgnoreCase(qjVar2.f29744f.getName());
                }
                int i11 = (qjVar.f29744f.lastModified() > qjVar2.f29744f.lastModified() ? 1 : (qjVar.f29744f.lastModified() == qjVar2.f29744f.lastModified() ? 0 : -1));
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
