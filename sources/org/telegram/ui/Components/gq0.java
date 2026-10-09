package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class gq0 implements r0.n, org.telegram.ui.ActionBar.l1 {
    public final int f26860a;
    public final mr0 f26861b;

    public gq0(mr0 mr0Var, int i10) {
        this.f26860a = i10;
        this.f26861b = mr0Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        mr0 mr0Var = this.f26861b;
        mr0Var.processLegacyContainerInsets(g10);
        i0.b f7 = k1Var.f46777a.f(519);
        if (!mr0Var.G0.equals(f7)) {
            mr0Var.G0 = f7;
            mr0Var.container.requestLayout();
        }
        return r0.k1.f46776b;
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.f26860a) {
            case 1:
                mr0 mr0Var = this.f26861b;
                mr0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = mr0Var.J0) != null && n1Var.isShowing()) {
                    mr0Var.J0.d(true);
                    return;
                }
                return;
            default:
                mr0 mr0Var2 = this.f26861b;
                mr0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var2 = mr0Var2.J0) != null && n1Var2.isShowing()) {
                    mr0Var2.J0.d(true);
                    return;
                }
                return;
        }
    }
}
