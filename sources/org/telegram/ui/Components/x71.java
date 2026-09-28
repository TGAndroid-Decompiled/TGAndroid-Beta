package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class x71 implements Runnable {
    public final int f30312a;
    public final c81 f30313b;

    public x71(c81 c81Var, int i10) {
        this.f30312a = i10;
        this.f30313b = c81Var;
    }

    @Override
    public final void run() {
        switch (this.f30312a) {
            case 0:
                c81 c81Var = this.f30313b;
                c81Var.h = 0.0f;
                d6 d6Var = c81Var.f23231b;
                if (d6Var != null) {
                    d6Var.u();
                    c81Var.f23231b = null;
                    return;
                }
                return;
            case 1:
                c81 c81Var2 = this.f30313b;
                c81Var2.f23229a = true;
                c81Var2.e = null;
                if (c81Var2.f23231b != null) {
                    c81Var2.f23242s = true;
                    PhotoViewer photoViewer = c81Var2.M.f34573a;
                    if (photoViewer.f31366u3) {
                        photoViewer.a3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                c81 c81Var3 = this.f30313b;
                c81Var3.f23229a = true;
                c81Var3.e = null;
                if (c81Var3.f23231b != null) {
                    c81Var3.f23242s = true;
                    PhotoViewer photoViewer2 = c81Var3.M.f34573a;
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
