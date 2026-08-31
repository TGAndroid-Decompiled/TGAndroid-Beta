package org.telegram.ui;
public final class lp0 extends org.telegram.ui.ActionBar.j {
    public final rp0 f38836a;

    public lp0(rp0 rp0Var) {
        this.f38836a = rp0Var;
    }

    @Override
    public final void b(int i10) {
        rp0 rp0Var = this.f38836a;
        if (i10 == -1) {
            rp0Var.finishFragment();
        } else if (i10 == 1) {
            if (rp0Var.S != null) {
                rp0Var.finishFragment(false);
                rp0Var.S.b();
            }
        } else if (i10 == 2) {
            rp0.U(rp0Var, null);
        }
    }
}
