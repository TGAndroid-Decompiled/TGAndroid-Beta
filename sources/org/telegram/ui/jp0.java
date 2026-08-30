package org.telegram.ui;
public final class jp0 extends org.telegram.ui.ActionBar.j {
    public final pp0 f35429a;

    public jp0(pp0 pp0Var) {
        this.f35429a = pp0Var;
    }

    @Override
    public final void b(int i10) {
        pp0 pp0Var = this.f35429a;
        if (i10 == -1) {
            pp0Var.finishFragment();
        } else if (i10 == 1) {
            if (pp0Var.S != null) {
                pp0Var.finishFragment(false);
                pp0Var.S.b();
            }
        } else if (i10 == 2) {
            pp0.U(pp0Var, null);
        }
    }
}
