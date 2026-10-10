package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class o81 implements Runnable {
    public final int f29379a;
    public final t81 f29380b;

    public o81(t81 t81Var, int i10) {
        this.f29379a = i10;
        this.f29380b = t81Var;
    }

    @Override
    public final void run() {
        switch (this.f29379a) {
            case 0:
                t81 t81Var = this.f29380b;
                t81Var.h = 0.0f;
                f6 f6Var = t81Var.f31050b;
                if (f6Var != null) {
                    f6Var.u();
                    t81Var.f31050b = null;
                    return;
                }
                return;
            case 1:
                t81 t81Var2 = this.f29380b;
                t81Var2.f31048a = true;
                t81Var2.f31055e = null;
                if (t81Var2.f31050b != null) {
                    t81Var2.f31062s = true;
                    PhotoViewer photoViewer = t81Var2.M.f41215a;
                    if (photoViewer.f34085u3) {
                        photoViewer.b3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                t81 t81Var3 = this.f29380b;
                t81Var3.f31048a = true;
                t81Var3.f31055e = null;
                if (t81Var3.f31050b != null) {
                    t81Var3.f31062s = true;
                    PhotoViewer photoViewer2 = t81Var3.M.f41215a;
                    if (photoViewer2.f34085u3) {
                        photoViewer2.b3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
