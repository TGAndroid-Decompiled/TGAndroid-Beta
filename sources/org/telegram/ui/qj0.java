package org.telegram.ui;
public final class qj0 implements org.telegram.ui.ActionBar.p1 {
    public final int f48902a;
    public final uj0 f48903b;

    public qj0(uj0 uj0Var, int i3) {
        this.f48902a = i3;
        this.f48903b = uj0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f48902a) {
            case 0:
                uj0 uj0Var = this.f48903b;
                uj0Var.c(true);
                uj0Var.R.finishFragment();
                return;
            default:
                uj0 uj0Var2 = this.f48903b;
                uj0Var2.c(true);
                uj0Var2.R.O1(null, 0, true);
                return;
        }
    }
}
