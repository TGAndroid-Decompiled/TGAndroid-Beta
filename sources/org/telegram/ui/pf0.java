package org.telegram.ui;
public final class pf0 implements org.telegram.ui.ActionBar.a2 {
    public final int f36469a;
    public final ag0 f36470b;

    public pf0(ag0 ag0Var, int i10) {
        this.f36469a = i10;
        this.f36470b = ag0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36469a) {
            case 0:
                ag0 ag0Var = this.f36470b;
                ag0Var.c(true);
                ag0Var.f32054s0.u1(0, true, null, true);
                return;
            default:
                this.f36470b.f32054s0.u1(0, true, null, true);
                return;
        }
    }
}
