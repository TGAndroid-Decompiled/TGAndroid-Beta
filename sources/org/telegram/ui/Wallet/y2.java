package org.telegram.ui.Wallet;

import android.view.View;
public final class y2 implements o1.g {
    public final int f33879a;
    public final d3 f33880b;

    public y2(d3 d3Var, int i10) {
        this.f33879a = i10;
        this.f33880b = d3Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f33879a) {
            case 0:
                d3 d3Var = this.f33880b;
                d3Var.C = f7;
                d3Var.f33045a.invalidate();
                return;
            case 1:
                d3 d3Var2 = this.f33880b;
                d3Var2.f33050c0 = f7;
                org.telegram.ui.Cells.x0 x0Var = d3Var2.f33045a;
                x0Var.invalidate();
                if (x0Var.getParent() instanceof View) {
                    ((View) x0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                d3 d3Var3 = this.f33880b;
                d3Var3.f33046a0 = f7;
                org.telegram.ui.Cells.x0 x0Var2 = d3Var3.f33045a;
                x0Var2.invalidate();
                if (x0Var2.getParent() instanceof View) {
                    ((View) x0Var2.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
