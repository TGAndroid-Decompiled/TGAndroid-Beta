package org.telegram.ui;
public final class lp0 extends org.telegram.ui.ActionBar.j {
    public final sp0 f38981a;

    public lp0(sp0 sp0Var) {
        this.f38981a = sp0Var;
    }

    @Override
    public final void b(int i10) {
        sp0 sp0Var = this.f38981a;
        if (i10 == -1) {
            sp0Var.finishFragment();
        } else if (i10 == 1) {
            if (sp0Var.V != null) {
                sp0Var.finishFragment(false);
                sp0Var.V.b();
            }
        } else if (i10 == 2) {
            sp0.U(sp0Var, null);
        }
    }
}
