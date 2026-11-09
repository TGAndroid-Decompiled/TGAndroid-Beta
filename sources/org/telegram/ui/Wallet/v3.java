package org.telegram.ui.Wallet;

import android.view.View;
public final class v3 implements r1.d {
    public final int f43208a;
    public final b4 f43209b;

    public v3(b4 b4Var, int i7) {
        this.f43208a = i7;
        this.f43209b = b4Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f43208a) {
            case 0:
                b4 b4Var = this.f43209b;
                b4Var.C = f10;
                b4Var.f42222a.invalidate();
                return;
            case 1:
                b4 b4Var2 = this.f43209b;
                b4Var2.f42227c0 = f10;
                org.telegram.ui.Cells.t0 t0Var = b4Var2.f42222a;
                t0Var.invalidate();
                if (t0Var.getParent() instanceof View) {
                    ((View) t0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                b4 b4Var3 = this.f43209b;
                b4Var3.f42223a0 = f10;
                org.telegram.ui.Cells.t0 t0Var2 = b4Var3.f42222a;
                t0Var2.invalidate();
                if (t0Var2.getParent() instanceof View) {
                    ((View) t0Var2.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
