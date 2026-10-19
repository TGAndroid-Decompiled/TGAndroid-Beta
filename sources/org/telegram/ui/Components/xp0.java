package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class xp0 implements r0.n, org.telegram.ui.ActionBar.k1 {
    public final int f32433a;
    public final er0 f32434b;

    public xp0(er0 er0Var, int i10) {
        this.f32433a = i10;
        this.f32434b = er0Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        er0 er0Var = this.f32434b;
        er0Var.processLegacyContainerInsets(g10);
        i0.b f7 = k1Var.f44827a.f(519);
        if (!er0Var.H0.equals(f7)) {
            er0Var.H0 = f7;
            er0Var.container.requestLayout();
        }
        return r0.k1.f44826b;
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f32433a) {
            case 1:
                er0 er0Var = this.f32434b;
                er0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = er0Var.K0) != null && m1Var.isShowing()) {
                    er0Var.K0.d(true);
                    return;
                }
                return;
            default:
                er0 er0Var2 = this.f32434b;
                er0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var2 = er0Var2.K0) != null && m1Var2.isShowing()) {
                    er0Var2.K0.d(true);
                    return;
                }
                return;
        }
    }
}
