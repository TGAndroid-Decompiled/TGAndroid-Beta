package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class t81 implements Runnable {
    public final int f30795a;
    public final y81 f30796b;

    public t81(y81 y81Var, int i10) {
        this.f30795a = i10;
        this.f30796b = y81Var;
    }

    @Override
    public final void run() {
        switch (this.f30795a) {
            case 0:
                y81 y81Var = this.f30796b;
                y81Var.h = 0.0f;
                f6 f6Var = y81Var.f32978b;
                if (f6Var != null) {
                    f6Var.u();
                    y81Var.f32978b = null;
                    return;
                }
                return;
            case 1:
                y81 y81Var2 = this.f30796b;
                y81Var2.f32976a = true;
                y81Var2.f32983e = null;
                if (y81Var2.f32978b != null) {
                    y81Var2.f32990s = true;
                    PhotoViewer photoViewer = y81Var2.M.f41984a;
                    if (photoViewer.f33886u3) {
                        photoViewer.b3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                y81 y81Var3 = this.f30796b;
                y81Var3.f32976a = true;
                y81Var3.f32983e = null;
                if (y81Var3.f32978b != null) {
                    y81Var3.f32990s = true;
                    PhotoViewer photoViewer2 = y81Var3.M.f41984a;
                    if (photoViewer2.f33886u3) {
                        photoViewer2.b3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
