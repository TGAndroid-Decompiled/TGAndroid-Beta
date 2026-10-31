package org.telegram.ui;
public final class cl0 implements org.telegram.ui.ActionBar.u1 {
    public final int f36482a;
    public final hl0 f36483b;

    public cl0(hl0 hl0Var, int i10) {
        this.f36482a = i10;
        this.f36483b = hl0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f36482a) {
            case 0:
                hl0 hl0Var = this.f36483b;
                hl0Var.c(true);
                hl0Var.Q.finishFragment();
                return;
            default:
                hl0 hl0Var2 = this.f36483b;
                hl0Var2.c(true);
                hl0Var2.Q.N1(null, 0, true);
                return;
        }
    }
}
