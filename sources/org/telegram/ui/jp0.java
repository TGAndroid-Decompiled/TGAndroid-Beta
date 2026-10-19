package org.telegram.ui;

import android.view.KeyEvent;
public final class jp0 implements org.telegram.ui.Components.e5, org.telegram.ui.ActionBar.k1 {
    public final int f38289a;
    public final sp0 f38290b;

    public jp0(sp0 sp0Var, int i10) {
        this.f38289a = i10;
        this.f38290b = sp0Var;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        switch (this.f38289a) {
            case 0:
                sp0 sp0Var = this.f38290b;
                sp0Var.V(sp0Var.f41501b, sp0Var.f41502c, z10, i10);
                sp0Var.finishFragment();
                return;
            default:
                sp0 sp0Var2 = this.f38290b;
                sp0Var2.V(sp0Var2.f41501b, sp0Var2.f41502c, z10, i10);
                sp0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        sp0 sp0Var = this.f38290b;
        sp0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = sp0Var.I) != null && m1Var.isShowing()) {
            sp0Var.I.d(true);
        }
    }
}
