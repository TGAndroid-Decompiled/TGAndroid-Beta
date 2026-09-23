package org.telegram.ui;
public final class jf0 implements org.telegram.ui.ActionBar.a2 {
    public final int f34451a;
    public final uf0 f34452b;

    public jf0(uf0 uf0Var, int i10) {
        this.f34451a = i10;
        this.f34452b = uf0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f34451a) {
            case 0:
                uf0 uf0Var = this.f34452b;
                uf0Var.c(true);
                uf0Var.f38093s0.u1(0, true, null, true);
                return;
            default:
                this.f34452b.f38093s0.u1(0, true, null, true);
                return;
        }
    }
}
