package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class x71 implements Runnable {
    public final int f30298a;
    public final c81 f30299b;

    public x71(c81 c81Var, int i10) {
        this.f30298a = i10;
        this.f30299b = c81Var;
    }

    @Override
    public final void run() {
        switch (this.f30298a) {
            case 0:
                c81 c81Var = this.f30299b;
                c81Var.h = 0.0f;
                d6 d6Var = c81Var.f23211b;
                if (d6Var != null) {
                    d6Var.u();
                    c81Var.f23211b = null;
                    return;
                }
                return;
            case 1:
                c81 c81Var2 = this.f30299b;
                c81Var2.f23209a = true;
                c81Var2.e = null;
                if (c81Var2.f23211b != null) {
                    c81Var2.f23222s = true;
                    PhotoViewer photoViewer = c81Var2.M.f34575a;
                    if (photoViewer.f31368u3) {
                        photoViewer.b3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                c81 c81Var3 = this.f30299b;
                c81Var3.f23209a = true;
                c81Var3.e = null;
                if (c81Var3.f23211b != null) {
                    c81Var3.f23222s = true;
                    PhotoViewer photoViewer2 = c81Var3.M.f34575a;
                    if (photoViewer2.f31368u3) {
                        photoViewer2.b3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
