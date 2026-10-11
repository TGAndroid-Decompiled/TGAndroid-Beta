package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class o81 implements Runnable {
    public final int f29411a;
    public final t81 f29412b;

    public o81(t81 t81Var, int i10) {
        this.f29411a = i10;
        this.f29412b = t81Var;
    }

    @Override
    public final void run() {
        switch (this.f29411a) {
            case 0:
                t81 t81Var = this.f29412b;
                t81Var.h = 0.0f;
                f6 f6Var = t81Var.f31161b;
                if (f6Var != null) {
                    f6Var.u();
                    t81Var.f31161b = null;
                    return;
                }
                return;
            case 1:
                t81 t81Var2 = this.f29412b;
                t81Var2.f31159a = true;
                t81Var2.f31166e = null;
                if (t81Var2.f31161b != null) {
                    t81Var2.f31173s = true;
                    PhotoViewer photoViewer = t81Var2.M.f40976a;
                    if (photoViewer.f34109u3) {
                        photoViewer.b3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                t81 t81Var3 = this.f29412b;
                t81Var3.f31159a = true;
                t81Var3.f31166e = null;
                if (t81Var3.f31161b != null) {
                    t81Var3.f31173s = true;
                    PhotoViewer photoViewer2 = t81Var3.M.f40976a;
                    if (photoViewer2.f34109u3) {
                        photoViewer2.b3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
