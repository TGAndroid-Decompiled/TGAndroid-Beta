package org.telegram.ui;

import android.view.KeyEvent;
public final class km0 implements org.telegram.ui.Components.r4, org.telegram.ui.ActionBar.e1 {
    public final int f48717a;
    public final om0 f48718b;

    public km0(om0 om0Var, int i7) {
        this.f48717a = i7;
        this.f48718b = om0Var;
    }

    @Override
    public void L(int i7, int i10, boolean z10) {
        switch (this.f48717a) {
            case 0:
                om0 om0Var = this.f48718b;
                om0Var.a0(om0Var.f49995b, om0Var.f49996c, z10, i7);
                om0Var.finishFragment();
                return;
            default:
                om0 om0Var2 = this.f48718b;
                om0Var2.a0(om0Var2.f49995b, om0Var2.f49996c, z10, i7);
                om0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        om0 om0Var = this.f48718b;
        om0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = om0Var.J) != null && g1Var.isShowing()) {
            om0Var.J.d(true);
        }
    }
}
