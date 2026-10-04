package org.telegram.ui;
public final class bn0 implements org.telegram.ui.ActionBar.a2 {
    public final int f35147a;
    public final gn0 f35148b;

    public bn0(gn0 gn0Var, int i10) {
        this.f35147a = i10;
        this.f35148b = gn0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35147a) {
            case 0:
                gn0 gn0Var = this.f35148b;
                gn0Var.c(true);
                gn0Var.Q.finishFragment();
                return;
            default:
                gn0 gn0Var2 = this.f35148b;
                gn0Var2.c(true);
                gn0Var2.Q.K1(null, 0, true);
                return;
        }
    }
}
