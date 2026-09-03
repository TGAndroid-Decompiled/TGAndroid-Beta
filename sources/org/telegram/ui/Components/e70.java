package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class e70 implements org.telegram.ui.ActionBar.n1 {
    public final int f24501a;
    public final p70 f24502b;

    public e70(p70 p70Var, int i10) {
        this.f24501a = i10;
        this.f24502b = p70Var;
    }

    @Override
    public final void n(KeyEvent keyEvent) {
        p70 p70Var;
        k70 k70Var;
        p70 p70Var2;
        k70 k70Var2;
        switch (this.f24501a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k70Var = (p70Var = this.f24502b).f27767m) != null && k70Var.isShowing()) {
                    p70Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k70Var2 = (p70Var2 = this.f24502b).f27767m) != null && k70Var2.isShowing()) {
                    p70Var2.u();
                    return;
                }
                return;
        }
    }
}
