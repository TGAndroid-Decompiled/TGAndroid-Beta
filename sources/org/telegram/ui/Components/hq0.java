package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class hq0 implements r0.n, org.telegram.ui.ActionBar.l1 {
    public final int f27129a;
    public final nr0 f27130b;

    public hq0(nr0 nr0Var, int i10) {
        this.f27129a = i10;
        this.f27130b = nr0Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        nr0 nr0Var = this.f27130b;
        nr0Var.processLegacyContainerInsets(g10);
        i0.b f7 = k1Var.f46821a.f(519);
        if (!nr0Var.G0.equals(f7)) {
            nr0Var.G0 = f7;
            nr0Var.container.requestLayout();
        }
        return r0.k1.f46820b;
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.f27129a) {
            case 1:
                nr0 nr0Var = this.f27130b;
                nr0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = nr0Var.J0) != null && n1Var.isShowing()) {
                    nr0Var.J0.d(true);
                    return;
                }
                return;
            default:
                nr0 nr0Var2 = this.f27130b;
                nr0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var2 = nr0Var2.J0) != null && n1Var2.isShowing()) {
                    nr0Var2.J0.d(true);
                    return;
                }
                return;
        }
    }
}
