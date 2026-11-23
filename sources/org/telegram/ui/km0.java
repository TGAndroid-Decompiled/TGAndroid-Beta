package org.telegram.ui;

import android.view.KeyEvent;
public final class km0 implements org.telegram.ui.Components.z4, org.telegram.ui.ActionBar.e1 {
    public final int f49499a;
    public final om0 f49500b;

    public km0(om0 om0Var, int i7) {
        this.f49499a = i7;
        this.f49500b = om0Var;
    }

    @Override
    public void I(int i7, int i10, boolean z10) {
        switch (this.f49499a) {
            case 0:
                om0 om0Var = this.f49500b;
                om0Var.a0(om0Var.f50718b, om0Var.f50719c, z10, i7);
                om0Var.finishFragment();
                return;
            default:
                om0 om0Var2 = this.f49500b;
                om0Var2.a0(om0Var2.f50718b, om0Var2.f50719c, z10, i7);
                om0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void m(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        om0 om0Var = this.f49500b;
        om0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = om0Var.J) != null && g1Var.isShowing()) {
            om0Var.J.d(true);
        }
    }
}
