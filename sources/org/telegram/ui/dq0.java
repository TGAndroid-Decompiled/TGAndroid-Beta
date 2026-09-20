package org.telegram.ui;

import android.view.KeyEvent;
public final class dq0 implements org.telegram.ui.Components.c5, org.telegram.ui.ActionBar.l1 {
    public final int f33117a;
    public final lq0 f33118b;

    public dq0(lq0 lq0Var, int i10) {
        this.f33117a = i10;
        this.f33118b = lq0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f33117a) {
            case 0:
                lq0 lq0Var = this.f33118b;
                lq0Var.V(lq0Var.f35506b, lq0Var.f35507c, z10, i10);
                lq0Var.finishFragment();
                return;
            default:
                lq0 lq0Var2 = this.f33118b;
                lq0Var2.V(lq0Var2.f35506b, lq0Var2.f35507c, z10, i10);
                lq0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        lq0 lq0Var = this.f33118b;
        lq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = lq0Var.I) != null && n1Var.isShowing()) {
            lq0Var.I.d(true);
        }
    }
}
