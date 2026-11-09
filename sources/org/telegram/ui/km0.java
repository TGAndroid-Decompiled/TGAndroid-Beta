package org.telegram.ui;

import android.view.KeyEvent;
public final class km0 implements org.telegram.ui.Components.t4, org.telegram.ui.ActionBar.e1 {
    public final int f47311a;
    public final om0 f47312b;

    public km0(om0 om0Var, int i7) {
        this.f47311a = i7;
        this.f47312b = om0Var;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        switch (this.f47311a) {
            case 0:
                om0 om0Var = this.f47312b;
                om0Var.a0(om0Var.f48476b, om0Var.f48477c, z9, i7);
                om0Var.finishFragment();
                return;
            default:
                om0 om0Var2 = this.f47312b;
                om0Var2.a0(om0Var2.f48476b, om0Var2.f48477c, z9, i7);
                om0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        om0 om0Var = this.f47312b;
        om0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = om0Var.I) != null && g1Var.isShowing()) {
            om0Var.I.d(true);
        }
    }
}
