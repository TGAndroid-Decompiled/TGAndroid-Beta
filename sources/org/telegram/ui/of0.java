package org.telegram.ui;
public final class of0 implements org.telegram.ui.ActionBar.z1 {
    public final int f40705a;
    public final zf0 f40706b;

    public of0(zf0 zf0Var, int i10) {
        this.f40705a = i10;
        this.f40706b = zf0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f40705a) {
            case 0:
                zf0 zf0Var = this.f40706b;
                zf0Var.c(true);
                zf0Var.f44838s0.u1(0, true, null, true);
                return;
            default:
                this.f40706b.f44838s0.u1(0, true, null, true);
                return;
        }
    }
}
