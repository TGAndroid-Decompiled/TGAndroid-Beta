package org.telegram.ui.Wallet;

import android.view.View;
public final class x3 implements r1.d {
    public final int f43321a;
    public final d4 f43322b;

    public x3(d4 d4Var, int i7) {
        this.f43321a = i7;
        this.f43322b = d4Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f43321a) {
            case 0:
                d4 d4Var = this.f43322b;
                d4Var.C = f10;
                d4Var.f42337a.invalidate();
                return;
            case 1:
                d4 d4Var2 = this.f43322b;
                d4Var2.f42342c0 = f10;
                org.telegram.ui.Cells.t0 t0Var = d4Var2.f42337a;
                t0Var.invalidate();
                if (t0Var.getParent() instanceof View) {
                    ((View) t0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                d4 d4Var3 = this.f43322b;
                d4Var3.f42338a0 = f10;
                org.telegram.ui.Cells.t0 t0Var2 = d4Var3.f42337a;
                t0Var2.invalidate();
                if (t0Var2.getParent() instanceof View) {
                    ((View) t0Var2.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
