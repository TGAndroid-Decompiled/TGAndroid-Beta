package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class v71 implements Runnable {
    public final int f29068a;
    public final a81 f29069b;

    public v71(a81 a81Var, int i10) {
        this.f29068a = i10;
        this.f29069b = a81Var;
    }

    @Override
    public final void run() {
        switch (this.f29068a) {
            case 0:
                a81 a81Var = this.f29069b;
                a81Var.h = 0.0f;
                d6 d6Var = a81Var.f22616b;
                if (d6Var != null) {
                    d6Var.u();
                    a81Var.f22616b = null;
                    return;
                }
                return;
            case 1:
                a81 a81Var2 = this.f29069b;
                a81Var2.f22614a = true;
                a81Var2.e = null;
                if (a81Var2.f22616b != null) {
                    a81Var2.f22627s = true;
                    PhotoViewer photoViewer = a81Var2.M.f34573a;
                    if (photoViewer.f31366u3) {
                        photoViewer.a3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                a81 a81Var3 = this.f29069b;
                a81Var3.f22614a = true;
                a81Var3.e = null;
                if (a81Var3.f22616b != null) {
                    a81Var3.f22627s = true;
                    PhotoViewer photoViewer2 = a81Var3.M.f34573a;
                    if (photoViewer2.f31366u3) {
                        photoViewer2.a3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
