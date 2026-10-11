package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class iq0 implements r0.n, org.telegram.ui.ActionBar.k1 {
    public final int f27448a;
    public final or0 f27449b;

    public iq0(or0 or0Var, int i10) {
        this.f27448a = i10;
        this.f27449b = or0Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        or0 or0Var = this.f27449b;
        or0Var.processLegacyContainerInsets(g10);
        i0.b f7 = k1Var.f46867a.f(519);
        if (!or0Var.G0.equals(f7)) {
            or0Var.G0 = f7;
            or0Var.container.requestLayout();
        }
        return r0.k1.f46866b;
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f27448a) {
            case 1:
                or0 or0Var = this.f27449b;
                or0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = or0Var.J0) != null && m1Var.isShowing()) {
                    or0Var.J0.d(true);
                    return;
                }
                return;
            default:
                or0 or0Var2 = this.f27449b;
                or0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var2 = or0Var2.J0) != null && m1Var2.isShowing()) {
                    or0Var2.J0.d(true);
                    return;
                }
                return;
        }
    }
}
