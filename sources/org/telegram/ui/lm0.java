package org.telegram.ui;

import android.view.KeyEvent;
public final class lm0 implements org.telegram.ui.Components.s4, org.telegram.ui.ActionBar.e1 {
    public final int f47636a;
    public final pm0 f47637b;

    public lm0(pm0 pm0Var, int i7) {
        this.f47636a = i7;
        this.f47637b = pm0Var;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        switch (this.f47636a) {
            case 0:
                pm0 pm0Var = this.f47637b;
                pm0Var.a0(pm0Var.f48794b, pm0Var.f48795c, z9, i7);
                pm0Var.finishFragment();
                return;
            default:
                pm0 pm0Var2 = this.f47637b;
                pm0Var2.a0(pm0Var2.f48794b, pm0Var2.f48795c, z9, i7);
                pm0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        pm0 pm0Var = this.f47637b;
        pm0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = pm0Var.I) != null && g1Var.isShowing()) {
            pm0Var.I.d(true);
        }
    }
}
