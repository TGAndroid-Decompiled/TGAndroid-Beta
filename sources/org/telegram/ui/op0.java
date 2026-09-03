package org.telegram.ui;

import android.view.KeyEvent;
public final class op0 implements org.telegram.ui.Components.y4, org.telegram.ui.ActionBar.n1 {
    public final int f36860a;
    public final wp0 f36861b;

    public op0(wp0 wp0Var, int i10) {
        this.f36860a = i10;
        this.f36861b = wp0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        switch (this.f36860a) {
            case 0:
                wp0 wp0Var = this.f36861b;
                wp0Var.V(wp0Var.f39748b, wp0Var.f39749c, z4, i10);
                wp0Var.finishFragment();
                return;
            default:
                wp0 wp0Var2 = this.f36861b;
                wp0Var2.V(wp0Var2.f39748b, wp0Var2.f39749c, z4, i10);
                wp0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        wp0 wp0Var = this.f36861b;
        wp0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = wp0Var.F) != null && p1Var.isShowing()) {
            wp0Var.F.d(true);
        }
    }
}
