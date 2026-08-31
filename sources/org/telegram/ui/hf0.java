package org.telegram.ui;
public final class hf0 implements org.telegram.ui.ActionBar.c2 {
    public final int f37485a;
    public final sf0 f37486b;

    public hf0(sf0 sf0Var, int i10) {
        this.f37485a = i10;
        this.f37486b = sf0Var;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f37485a) {
            case 0:
                sf0 sf0Var = this.f37486b;
                sf0Var.c(true);
                sf0Var.f41271p0.u1(0, true, null, true);
                return;
            default:
                this.f37486b.f41271p0.u1(0, true, null, true);
                return;
        }
    }
}
