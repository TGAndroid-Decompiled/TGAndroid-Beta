package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class yp0 implements r0.n, org.telegram.ui.ActionBar.k1 {
    public final int f32714a;
    public final fr0 f32715b;

    public yp0(fr0 fr0Var, int i10) {
        this.f32714a = i10;
        this.f32715b = fr0Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        fr0 fr0Var = this.f32715b;
        fr0Var.processLegacyContainerInsets(g10);
        i0.b f7 = k1Var.f44839a.f(519);
        if (!fr0Var.H0.equals(f7)) {
            fr0Var.H0 = f7;
            fr0Var.container.requestLayout();
        }
        return r0.k1.f44838b;
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f32714a) {
            case 1:
                fr0 fr0Var = this.f32715b;
                fr0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = fr0Var.K0) != null && m1Var.isShowing()) {
                    fr0Var.K0.d(true);
                    return;
                }
                return;
            default:
                fr0 fr0Var2 = this.f32715b;
                fr0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var2 = fr0Var2.K0) != null && m1Var2.isShowing()) {
                    fr0Var2.K0.d(true);
                    return;
                }
                return;
        }
    }
}
