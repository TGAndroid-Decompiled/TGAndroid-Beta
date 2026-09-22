package org.telegram.ui;

import android.view.KeyEvent;
public final class dq0 implements org.telegram.ui.Components.c5, org.telegram.ui.ActionBar.l1 {
    public final int f33137a;
    public final lq0 f33138b;

    public dq0(lq0 lq0Var, int i10) {
        this.f33137a = i10;
        this.f33138b = lq0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f33137a) {
            case 0:
                lq0 lq0Var = this.f33138b;
                lq0Var.V(lq0Var.f35529b, lq0Var.f35530c, z10, i10);
                lq0Var.finishFragment();
                return;
            default:
                lq0 lq0Var2 = this.f33138b;
                lq0Var2.V(lq0Var2.f35529b, lq0Var2.f35530c, z10, i10);
                lq0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        lq0 lq0Var = this.f33138b;
        lq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = lq0Var.I) != null && n1Var.isShowing()) {
            lq0Var.I.d(true);
        }
    }
}
