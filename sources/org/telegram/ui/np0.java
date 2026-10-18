package org.telegram.ui;
public final class np0 extends org.telegram.ui.ActionBar.j {
    public final up0 f39527a;

    public np0(up0 up0Var) {
        this.f39527a = up0Var;
    }

    @Override
    public final void b(int i10) {
        up0 up0Var = this.f39527a;
        if (i10 == -1) {
            up0Var.finishFragment();
        } else if (i10 == 1) {
            if (up0Var.V != null) {
                up0Var.finishFragment(false);
                up0Var.V.b();
            }
        } else if (i10 == 2) {
            up0.U(up0Var, null);
        }
    }
}
