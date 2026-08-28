package org.telegram.ui;
public final class cp0 extends org.telegram.ui.ActionBar.j {
    public final ip0 f37285a;

    public cp0(ip0 ip0Var) {
        this.f37285a = ip0Var;
    }

    @Override
    public final void b(int i9) {
        ip0 ip0Var = this.f37285a;
        if (i9 == -1) {
            ip0Var.finishFragment();
        } else if (i9 == 1) {
            if (ip0Var.R != null) {
                ip0Var.finishFragment(false);
                ip0Var.R.b();
            }
        } else if (i9 == 2) {
            ip0.T(ip0Var, null);
        }
    }
}
