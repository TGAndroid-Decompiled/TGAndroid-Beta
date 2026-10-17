package org.telegram.ui;
public final class mp0 extends org.telegram.ui.ActionBar.j {
    public final tp0 f39227a;

    public mp0(tp0 tp0Var) {
        this.f39227a = tp0Var;
    }

    @Override
    public final void b(int i10) {
        tp0 tp0Var = this.f39227a;
        if (i10 == -1) {
            tp0Var.finishFragment();
        } else if (i10 == 1) {
            if (tp0Var.V != null) {
                tp0Var.finishFragment(false);
                tp0Var.V.b();
            }
        } else if (i10 == 2) {
            tp0.U(tp0Var, null);
        }
    }
}
