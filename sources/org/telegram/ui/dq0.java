package org.telegram.ui;
public final class dq0 extends org.telegram.ui.ActionBar.j {
    public final kq0 f37062a;

    public dq0(kq0 kq0Var) {
        this.f37062a = kq0Var;
    }

    @Override
    public final void b(int i10) {
        kq0 kq0Var = this.f37062a;
        if (i10 == -1) {
            kq0Var.finishFragment();
        } else if (i10 == 1) {
            if (kq0Var.V != null) {
                kq0Var.finishFragment(false);
                kq0Var.V.b();
            }
        } else if (i10 == 2) {
            kq0.U(kq0Var, null);
        }
    }
}
