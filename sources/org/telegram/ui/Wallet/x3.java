package org.telegram.ui.Wallet;

import android.view.View;
public final class x3 implements r1.d {
    public final int f43324a;
    public final d4 f43325b;

    public x3(d4 d4Var, int i7) {
        this.f43324a = i7;
        this.f43325b = d4Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f43324a) {
            case 0:
                d4 d4Var = this.f43325b;
                d4Var.C = f10;
                d4Var.f42302a.invalidate();
                return;
            case 1:
                d4 d4Var2 = this.f43325b;
                d4Var2.f42307c0 = f10;
                org.telegram.ui.Cells.t0 t0Var = d4Var2.f42302a;
                t0Var.invalidate();
                if (t0Var.getParent() instanceof View) {
                    ((View) t0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                d4 d4Var3 = this.f43325b;
                d4Var3.f42303a0 = f10;
                org.telegram.ui.Cells.t0 t0Var2 = d4Var3.f42302a;
                t0Var2.invalidate();
                if (t0Var2.getParent() instanceof View) {
                    ((View) t0Var2.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
