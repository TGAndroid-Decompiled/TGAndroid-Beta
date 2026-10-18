package org.telegram.ui;

import android.view.KeyEvent;
public final class lp0 implements org.telegram.ui.Components.e5, org.telegram.ui.ActionBar.k1 {
    public final int f38906a;
    public final up0 f38907b;

    public lp0(up0 up0Var, int i10) {
        this.f38906a = i10;
        this.f38907b = up0Var;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        switch (this.f38906a) {
            case 0:
                up0 up0Var = this.f38907b;
                up0Var.V(up0Var.f42042b, up0Var.f42043c, z10, i10);
                up0Var.finishFragment();
                return;
            default:
                up0 up0Var2 = this.f38907b;
                up0Var2.V(up0Var2.f42042b, up0Var2.f42043c, z10, i10);
                up0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        up0 up0Var = this.f38907b;
        up0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = up0Var.I) != null && m1Var.isShowing()) {
            up0Var.I.d(true);
        }
    }
}
