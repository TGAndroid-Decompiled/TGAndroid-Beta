package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class p70 implements org.telegram.ui.ActionBar.k1 {
    public final int f27277a;
    public final a80 f27278b;

    public p70(a80 a80Var, int i10) {
        this.f27277a = i10;
        this.f27278b = a80Var;
    }

    @Override
    public final void p(KeyEvent keyEvent) {
        a80 a80Var;
        v70 v70Var;
        a80 a80Var2;
        v70 v70Var2;
        switch (this.f27277a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (v70Var = (a80Var = this.f27278b).f22593m) != null && v70Var.isShowing()) {
                    a80Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (v70Var2 = (a80Var2 = this.f27278b).f22593m) != null && v70Var2.isShowing()) {
                    a80Var2.u();
                    return;
                }
                return;
        }
    }
}
