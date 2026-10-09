package org.telegram.ui;
public final class nf0 implements org.telegram.ui.ActionBar.a2 {
    public final int f40196a;
    public final zf0 f40197b;

    public nf0(zf0 zf0Var, int i10) {
        this.f40196a = i10;
        this.f40197b = zf0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f40196a) {
            case 0:
                zf0 zf0Var = this.f40197b;
                zf0Var.c(true);
                zf0Var.f44610s0.u1(0, true, null, true);
                return;
            default:
                this.f40197b.f44610s0.u1(0, true, null, true);
                return;
        }
    }
}
