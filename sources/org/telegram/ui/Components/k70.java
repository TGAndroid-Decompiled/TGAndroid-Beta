package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class k70 implements org.telegram.ui.ActionBar.l1 {
    public final int f25685a;
    public final v70 f25686b;

    public k70(v70 v70Var, int i10) {
        this.f25685a = i10;
        this.f25686b = v70Var;
    }

    @Override
    public final void o(KeyEvent keyEvent) {
        v70 v70Var;
        q70 q70Var;
        v70 v70Var2;
        q70 q70Var2;
        switch (this.f25685a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (q70Var = (v70Var = this.f25686b).f28984m) != null && q70Var.isShowing()) {
                    v70Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (q70Var2 = (v70Var2 = this.f25686b).f28984m) != null && q70Var2.isShowing()) {
                    v70Var2.u();
                    return;
                }
                return;
        }
    }
}
