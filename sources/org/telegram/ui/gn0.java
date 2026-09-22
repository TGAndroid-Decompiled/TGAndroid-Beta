package org.telegram.ui;
public final class gn0 implements org.telegram.ui.ActionBar.a2 {
    public final int f33957a;
    public final ln0 f33958b;

    public gn0(ln0 ln0Var, int i10) {
        this.f33957a = i10;
        this.f33958b = ln0Var;
    }

    @Override
    public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f33957a) {
            case 0:
                ln0 ln0Var = this.f33958b;
                ln0Var.c(true);
                ln0Var.Q.finishFragment();
                return;
            default:
                ln0 ln0Var2 = this.f33958b;
                ln0Var2.c(true);
                ln0Var2.Q.K1(null, 0, true);
                return;
        }
    }
}
