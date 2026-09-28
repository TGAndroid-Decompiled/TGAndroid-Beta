package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class x71 implements Runnable {
    public final int f30313a;
    public final c81 f30314b;

    public x71(c81 c81Var, int i10) {
        this.f30313a = i10;
        this.f30314b = c81Var;
    }

    @Override
    public final void run() {
        switch (this.f30313a) {
            case 0:
                c81 c81Var = this.f30314b;
                c81Var.h = 0.0f;
                d6 d6Var = c81Var.f23232b;
                if (d6Var != null) {
                    d6Var.u();
                    c81Var.f23232b = null;
                    return;
                }
                return;
            case 1:
                c81 c81Var2 = this.f30314b;
                c81Var2.f23230a = true;
                c81Var2.e = null;
                if (c81Var2.f23232b != null) {
                    c81Var2.f23243s = true;
                    PhotoViewer photoViewer = c81Var2.M.f34574a;
                    if (photoViewer.f31367u3) {
                        photoViewer.a3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                c81 c81Var3 = this.f30314b;
                c81Var3.f23230a = true;
                c81Var3.e = null;
                if (c81Var3.f23232b != null) {
                    c81Var3.f23243s = true;
                    PhotoViewer photoViewer2 = c81Var3.M.f34574a;
                    if (photoViewer2.f31367u3) {
                        photoViewer2.a3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
