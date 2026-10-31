package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;
public final class hj implements Comparator {
    public final int f26748a;
    public final xj f26749b;

    public hj(xj xjVar, int i10) {
        this.f26748a = i10;
        this.f26749b = xjVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        qj qjVar = (qj) obj;
        qj qjVar2 = (qj) obj2;
        switch (this.f26748a) {
            case 0:
                xj xjVar = this.f26749b;
                xjVar.getClass();
                File file = qjVar.f29668f;
                if (file != null) {
                    if (qjVar2.f29668f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != qjVar2.f29668f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (!isDirectory && !xjVar.f32482c0) {
                            int i10 = (qjVar.f29668f.lastModified() > qjVar2.f29668f.lastModified() ? 1 : (qjVar.f29668f.lastModified() == qjVar2.f29668f.lastModified() ? 0 : -1));
                            if (i10 == 0) {
                                return 0;
                            }
                            if (i10 > 0) {
                            }
                        } else {
                            return qjVar.f29668f.getName().compareToIgnoreCase(qjVar2.f29668f.getName());
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f26749b.f32482c0) {
                    return qjVar.f29668f.getName().compareToIgnoreCase(qjVar2.f29668f.getName());
                }
                int i11 = (qjVar.f29668f.lastModified() > qjVar2.f29668f.lastModified() ? 1 : (qjVar.f29668f.lastModified() == qjVar2.f29668f.lastModified() ? 0 : -1));
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
