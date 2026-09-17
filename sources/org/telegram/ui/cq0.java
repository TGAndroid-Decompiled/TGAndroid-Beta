package org.telegram.ui;

import android.view.KeyEvent;
public final class cq0 implements org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.l1 {
    public final int f35549a;
    public final kq0 f35550b;

    public cq0(kq0 kq0Var, int i10) {
        this.f35549a = i10;
        this.f35550b = kq0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f35549a) {
            case 0:
                kq0 kq0Var = this.f35550b;
                kq0Var.V(kq0Var.f38133b, kq0Var.f38134c, z10, i10);
                kq0Var.finishFragment();
                return;
            default:
                kq0 kq0Var2 = this.f35550b;
                kq0Var2.V(kq0Var2.f38133b, kq0Var2.f38134c, z10, i10);
                kq0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        kq0 kq0Var = this.f35550b;
        kq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = kq0Var.I) != null && n1Var.isShowing()) {
            kq0Var.I.d(true);
        }
    }
}
