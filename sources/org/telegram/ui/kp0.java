package org.telegram.ui;

import android.view.KeyEvent;
public final class kp0 implements org.telegram.ui.Components.e5, org.telegram.ui.ActionBar.k1 {
    public final int f38632a;
    public final tp0 f38633b;

    public kp0(tp0 tp0Var, int i10) {
        this.f38632a = i10;
        this.f38633b = tp0Var;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        switch (this.f38632a) {
            case 0:
                tp0 tp0Var = this.f38633b;
                tp0Var.V(tp0Var.f41799b, tp0Var.f41800c, z10, i10);
                tp0Var.finishFragment();
                return;
            default:
                tp0 tp0Var2 = this.f38633b;
                tp0Var2.V(tp0Var2.f41799b, tp0Var2.f41800c, z10, i10);
                tp0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        tp0 tp0Var = this.f38633b;
        tp0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = tp0Var.I) != null && m1Var.isShowing()) {
            tp0Var.I.d(true);
        }
    }
}
