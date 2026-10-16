package org.telegram.ui;

import android.view.KeyEvent;
public final class fq0 implements org.telegram.ui.Components.f5, org.telegram.ui.ActionBar.k1 {
    public final int f35906a;
    public final oq0 f35907b;

    public fq0(oq0 oq0Var, int i10) {
        this.f35906a = i10;
        this.f35907b = oq0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f35906a) {
            case 0:
                oq0 oq0Var = this.f35907b;
                oq0Var.V(oq0Var.f38729b, oq0Var.f38730c, z10, i10);
                oq0Var.finishFragment();
                return;
            default:
                oq0 oq0Var2 = this.f35907b;
                oq0Var2.V(oq0Var2.f38729b, oq0Var2.f38730c, z10, i10);
                oq0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        oq0 oq0Var = this.f35907b;
        oq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = oq0Var.I) != null && m1Var.isShowing()) {
            oq0Var.I.d(true);
        }
    }
}
