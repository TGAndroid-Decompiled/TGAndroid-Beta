package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class t81 implements Runnable {
    public final int f30792a;
    public final y81 f30793b;

    public t81(y81 y81Var, int i10) {
        this.f30792a = i10;
        this.f30793b = y81Var;
    }

    @Override
    public final void run() {
        switch (this.f30792a) {
            case 0:
                y81 y81Var = this.f30793b;
                y81Var.h = 0.0f;
                f6 f6Var = y81Var.f32985b;
                if (f6Var != null) {
                    f6Var.u();
                    y81Var.f32985b = null;
                    return;
                }
                return;
            case 1:
                y81 y81Var2 = this.f30793b;
                y81Var2.f32983a = true;
                y81Var2.f32990e = null;
                if (y81Var2.f32985b != null) {
                    y81Var2.f32997s = true;
                    PhotoViewer photoViewer = y81Var2.M.f41980a;
                    if (photoViewer.f33884u3) {
                        photoViewer.b3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                y81 y81Var3 = this.f30793b;
                y81Var3.f32983a = true;
                y81Var3.f32990e = null;
                if (y81Var3.f32985b != null) {
                    y81Var3.f32997s = true;
                    PhotoViewer photoViewer2 = y81Var3.M.f41980a;
                    if (photoViewer2.f33884u3) {
                        photoViewer2.b3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
