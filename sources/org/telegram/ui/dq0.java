package org.telegram.ui;

import android.view.KeyEvent;
public final class dq0 implements org.telegram.ui.Components.b5, org.telegram.ui.ActionBar.m1 {
    public final int f33212a;
    public final lq0 f33213b;

    public dq0(lq0 lq0Var, int i10) {
        this.f33212a = i10;
        this.f33213b = lq0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f33212a) {
            case 0:
                lq0 lq0Var = this.f33213b;
                lq0Var.V(lq0Var.f35606b, lq0Var.f35607c, z10, i10);
                lq0Var.finishFragment();
                return;
            default:
                lq0 lq0Var2 = this.f33213b;
                lq0Var2.V(lq0Var2.f35606b, lq0Var2.f35607c, z10, i10);
                lq0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        lq0 lq0Var = this.f33213b;
        lq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = lq0Var.I) != null && o1Var.isShowing()) {
            lq0Var.I.d(true);
        }
    }
}
