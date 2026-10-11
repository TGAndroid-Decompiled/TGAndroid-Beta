package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class hq0 implements r0.n, org.telegram.ui.ActionBar.k1 {
    public final int f27219a;
    public final nr0 f27220b;

    public hq0(nr0 nr0Var, int i10) {
        this.f27219a = i10;
        this.f27220b = nr0Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        nr0 nr0Var = this.f27220b;
        nr0Var.processLegacyContainerInsets(g10);
        i0.b f7 = k1Var.f46901a.f(519);
        if (!nr0Var.G0.equals(f7)) {
            nr0Var.G0 = f7;
            nr0Var.container.requestLayout();
        }
        return r0.k1.f46900b;
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f27219a) {
            case 1:
                nr0 nr0Var = this.f27220b;
                nr0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = nr0Var.J0) != null && m1Var.isShowing()) {
                    nr0Var.J0.d(true);
                    return;
                }
                return;
            default:
                nr0 nr0Var2 = this.f27220b;
                nr0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var2 = nr0Var2.J0) != null && m1Var2.isShowing()) {
                    nr0Var2.J0.d(true);
                    return;
                }
                return;
        }
    }
}
