package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class v71 implements Runnable {
    public final int f29062a;
    public final a81 f29063b;

    public v71(a81 a81Var, int i10) {
        this.f29062a = i10;
        this.f29063b = a81Var;
    }

    @Override
    public final void run() {
        switch (this.f29062a) {
            case 0:
                a81 a81Var = this.f29063b;
                a81Var.h = 0.0f;
                d6 d6Var = a81Var.f22602b;
                if (d6Var != null) {
                    d6Var.u();
                    a81Var.f22602b = null;
                    return;
                }
                return;
            case 1:
                a81 a81Var2 = this.f29063b;
                a81Var2.f22600a = true;
                a81Var2.e = null;
                if (a81Var2.f22602b != null) {
                    a81Var2.f22613s = true;
                    PhotoViewer photoViewer = a81Var2.M.f34559a;
                    if (photoViewer.f31352u3) {
                        photoViewer.a3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                a81 a81Var3 = this.f29063b;
                a81Var3.f22600a = true;
                a81Var3.e = null;
                if (a81Var3.f22602b != null) {
                    a81Var3.f22613s = true;
                    PhotoViewer photoViewer2 = a81Var3.M.f34559a;
                    if (photoViewer2.f31352u3) {
                        photoViewer2.a3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
