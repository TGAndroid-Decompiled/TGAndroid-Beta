package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class xp0 implements r0.n, org.telegram.ui.ActionBar.k1 {
    public final int f32438a;
    public final dr0 f32439b;

    public xp0(dr0 dr0Var, int i10) {
        this.f32438a = i10;
        this.f32439b = dr0Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        dr0 dr0Var = this.f32439b;
        dr0Var.processLegacyContainerInsets(g10);
        i0.b f7 = k1Var.f44873a.f(519);
        if (!dr0Var.G0.equals(f7)) {
            dr0Var.G0 = f7;
            dr0Var.container.requestLayout();
        }
        return r0.k1.f44872b;
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f32438a) {
            case 1:
                dr0 dr0Var = this.f32439b;
                dr0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = dr0Var.J0) != null && m1Var.isShowing()) {
                    dr0Var.J0.d(true);
                    return;
                }
                return;
            default:
                dr0 dr0Var2 = this.f32439b;
                dr0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var2 = dr0Var2.J0) != null && m1Var2.isShowing()) {
                    dr0Var2.J0.d(true);
                    return;
                }
                return;
        }
    }
}
