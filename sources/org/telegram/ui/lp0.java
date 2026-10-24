package org.telegram.ui;

import android.view.KeyEvent;
public final class lp0 implements org.telegram.ui.Components.b5, org.telegram.ui.ActionBar.k1 {
    public final int f39328a;
    public final up0 f39329b;

    public lp0(up0 up0Var, int i10) {
        this.f39328a = i10;
        this.f39329b = up0Var;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        switch (this.f39328a) {
            case 0:
                up0 up0Var = this.f39329b;
                up0Var.V(up0Var.f42464b, up0Var.f42465c, z10, i10);
                up0Var.finishFragment();
                return;
            default:
                up0 up0Var2 = this.f39329b;
                up0Var2.V(up0Var2.f42464b, up0Var2.f42465c, z10, i10);
                up0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        up0 up0Var = this.f39329b;
        up0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = up0Var.I) != null && m1Var.isShowing()) {
            up0Var.I.d(true);
        }
    }
}
