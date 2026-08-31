package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class f70 implements org.telegram.ui.ActionBar.n1 {
    public final int f26779a;
    public final q70 f26780b;

    public f70(q70 q70Var, int i10) {
        this.f26779a = i10;
        this.f26780b = q70Var;
    }

    @Override
    public final void n(KeyEvent keyEvent) {
        q70 q70Var;
        l70 l70Var;
        q70 q70Var2;
        l70 l70Var2;
        switch (this.f26779a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (l70Var = (q70Var = this.f26780b).f30319m) != null && l70Var.isShowing()) {
                    q70Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (l70Var2 = (q70Var2 = this.f26780b).f30319m) != null && l70Var2.isShowing()) {
                    q70Var2.u();
                    return;
                }
                return;
        }
    }
}
