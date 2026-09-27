package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class p70 implements org.telegram.ui.ActionBar.m1 {
    public final int f27300a;
    public final a80 f27301b;

    public p70(a80 a80Var, int i10) {
        this.f27300a = i10;
        this.f27301b = a80Var;
    }

    @Override
    public final void p(KeyEvent keyEvent) {
        a80 a80Var;
        v70 v70Var;
        a80 a80Var2;
        v70 v70Var2;
        switch (this.f27300a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (v70Var = (a80Var = this.f27301b).f22596m) != null && v70Var.isShowing()) {
                    a80Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (v70Var2 = (a80Var2 = this.f27301b).f22596m) != null && v70Var2.isShowing()) {
                    a80Var2.u();
                    return;
                }
                return;
        }
    }
}
