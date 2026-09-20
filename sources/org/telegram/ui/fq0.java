package org.telegram.ui;
public final class fq0 extends org.telegram.ui.ActionBar.j {
    public final lq0 f33706a;

    public fq0(lq0 lq0Var) {
        this.f33706a = lq0Var;
    }

    @Override
    public final void b(int i10) {
        lq0 lq0Var = this.f33706a;
        if (i10 == -1) {
            lq0Var.finishFragment();
        } else if (i10 == 1) {
            if (lq0Var.V != null) {
                lq0Var.finishFragment(false);
                lq0Var.V.b();
            }
        } else if (i10 == 2) {
            lq0.U(lq0Var, null);
        }
    }
}
