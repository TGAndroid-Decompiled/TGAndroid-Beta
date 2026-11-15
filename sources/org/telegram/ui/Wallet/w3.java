package org.telegram.ui.Wallet;

import android.view.View;
public final class w3 implements r1.d {
    public final int f44623a;
    public final c4 f44624b;

    public w3(c4 c4Var, int i7) {
        this.f44623a = i7;
        this.f44624b = c4Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f44623a) {
            case 0:
                c4 c4Var = this.f44624b;
                c4Var.C = f10;
                c4Var.f43571a.invalidate();
                return;
            case 1:
                c4 c4Var2 = this.f44624b;
                c4Var2.f43576c0 = f10;
                org.telegram.ui.Cells.t0 t0Var = c4Var2.f43571a;
                t0Var.invalidate();
                if (t0Var.getParent() instanceof View) {
                    ((View) t0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                c4 c4Var3 = this.f44624b;
                c4Var3.f43572a0 = f10;
                org.telegram.ui.Cells.t0 t0Var2 = c4Var3.f43571a;
                t0Var2.invalidate();
                if (t0Var2.getParent() instanceof View) {
                    ((View) t0Var2.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
