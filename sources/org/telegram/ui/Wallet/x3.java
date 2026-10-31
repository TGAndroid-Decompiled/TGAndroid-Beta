package org.telegram.ui.Wallet;

import android.view.View;
public final class x3 implements o1.g {
    public final int f35380a;
    public final d4 f35381b;

    public x3(d4 d4Var, int i10) {
        this.f35380a = i10;
        this.f35381b = d4Var;
    }

    @Override
    public final void a(o1.j jVar, float f7, float f10) {
        switch (this.f35380a) {
            case 0:
                d4 d4Var = this.f35381b;
                d4Var.C = f7;
                d4Var.f34377a.invalidate();
                return;
            case 1:
                d4 d4Var2 = this.f35381b;
                d4Var2.f34382c0 = f7;
                org.telegram.ui.Cells.s0 s0Var = d4Var2.f34377a;
                s0Var.invalidate();
                if (s0Var.getParent() instanceof View) {
                    ((View) s0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                d4 d4Var3 = this.f35381b;
                d4Var3.f34378a0 = f7;
                org.telegram.ui.Cells.s0 s0Var2 = d4Var3.f34377a;
                s0Var2.invalidate();
                if (s0Var2.getParent() instanceof View) {
                    ((View) s0Var2.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
