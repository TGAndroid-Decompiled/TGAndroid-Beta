package org.telegram.ui.Wallet;

import android.view.View;
public final class x3 implements o1.g {
    public final int f35386a;
    public final d4 f35387b;

    public x3(d4 d4Var, int i10) {
        this.f35386a = i10;
        this.f35387b = d4Var;
    }

    @Override
    public final void a(o1.j jVar, float f7, float f10) {
        switch (this.f35386a) {
            case 0:
                d4 d4Var = this.f35387b;
                d4Var.C = f7;
                d4Var.f34382a.invalidate();
                return;
            case 1:
                d4 d4Var2 = this.f35387b;
                d4Var2.f34387c0 = f7;
                org.telegram.ui.Cells.s0 s0Var = d4Var2.f34382a;
                s0Var.invalidate();
                if (s0Var.getParent() instanceof View) {
                    ((View) s0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                d4 d4Var3 = this.f35387b;
                d4Var3.f34383a0 = f7;
                org.telegram.ui.Cells.s0 s0Var2 = d4Var3.f34382a;
                s0Var2.invalidate();
                if (s0Var2.getParent() instanceof View) {
                    ((View) s0Var2.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
