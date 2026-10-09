package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class n81 implements Runnable {
    public final int f29077a;
    public final s81 f29078b;

    public n81(s81 s81Var, int i10) {
        this.f29077a = i10;
        this.f29078b = s81Var;
    }

    @Override
    public final void run() {
        switch (this.f29077a) {
            case 0:
                s81 s81Var = this.f29078b;
                s81Var.h = 0.0f;
                f6 f6Var = s81Var.f30719b;
                if (f6Var != null) {
                    f6Var.u();
                    s81Var.f30719b = null;
                    return;
                }
                return;
            case 1:
                s81 s81Var2 = this.f29078b;
                s81Var2.f30717a = true;
                s81Var2.f30724e = null;
                if (s81Var2.f30719b != null) {
                    s81Var2.f30731s = true;
                    PhotoViewer photoViewer = s81Var2.M.f41169a;
                    if (photoViewer.f34047u3) {
                        photoViewer.b3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                s81 s81Var3 = this.f29078b;
                s81Var3.f30717a = true;
                s81Var3.f30724e = null;
                if (s81Var3.f30719b != null) {
                    s81Var3.f30731s = true;
                    PhotoViewer photoViewer2 = s81Var3.M.f41169a;
                    if (photoViewer2.f34047u3) {
                        photoViewer2.b3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
