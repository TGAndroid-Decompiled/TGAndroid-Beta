package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class n71 implements Runnable {
    public final int f29420a;
    public final r71 f29421b;

    public n71(r71 r71Var, int i10) {
        this.f29420a = i10;
        this.f29421b = r71Var;
    }

    @Override
    public final void run() {
        switch (this.f29420a) {
            case 0:
                r71 r71Var = this.f29421b;
                r71Var.h = 0.0f;
                y5 y5Var = r71Var.f30627b;
                if (y5Var != null) {
                    y5Var.u();
                    r71Var.f30627b = null;
                    return;
                }
                return;
            case 1:
                r71 r71Var2 = this.f29421b;
                r71Var2.f30625a = true;
                r71Var2.f30632e = null;
                if (r71Var2.f30627b != null) {
                    r71Var2.f30636s = true;
                    PhotoViewer photoViewer = r71Var2.J.f42874a;
                    if (photoViewer.f34378r3) {
                        photoViewer.b3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                r71 r71Var3 = this.f29421b;
                r71Var3.f30625a = true;
                r71Var3.f30632e = null;
                if (r71Var3.f30627b != null) {
                    r71Var3.f30636s = true;
                    PhotoViewer photoViewer2 = r71Var3.J.f42874a;
                    if (photoViewer2.f34378r3) {
                        photoViewer2.b3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
