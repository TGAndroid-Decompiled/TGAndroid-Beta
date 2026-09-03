package org.telegram.ui;
public final class hf0 implements org.telegram.ui.ActionBar.c2 {
    public final int f37371a;
    public final sf0 f37372b;

    public hf0(sf0 sf0Var, int i10) {
        this.f37371a = i10;
        this.f37372b = sf0Var;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f37371a) {
            case 0:
                sf0 sf0Var = this.f37372b;
                sf0Var.c(true);
                sf0Var.f41181p0.u1(0, true, null, true);
                return;
            default:
                this.f37372b.f41181p0.u1(0, true, null, true);
                return;
        }
    }
}
