package org.telegram.ui;
public final class mf0 implements org.telegram.ui.ActionBar.z1 {
    public final int f39965a;
    public final yf0 f39966b;

    public mf0(yf0 yf0Var, int i10) {
        this.f39965a = i10;
        this.f39966b = yf0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f39965a) {
            case 0:
                yf0 yf0Var = this.f39966b;
                yf0Var.c(true);
                yf0Var.f44416s0.u1(0, true, null, true);
                return;
            default:
                this.f39966b.f44416s0.u1(0, true, null, true);
                return;
        }
    }
}
