package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class d70 implements org.telegram.ui.ActionBar.l1 {
    public final int f23298a;
    public final o70 f23299b;

    public d70(o70 o70Var, int i10) {
        this.f23298a = i10;
        this.f23299b = o70Var;
    }

    @Override
    public final void o(KeyEvent keyEvent) {
        o70 o70Var;
        j70 j70Var;
        o70 o70Var2;
        j70 j70Var2;
        switch (this.f23298a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (j70Var = (o70Var = this.f23299b).f26659m) != null && j70Var.isShowing()) {
                    o70Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (j70Var2 = (o70Var2 = this.f23299b).f26659m) != null && j70Var2.isShowing()) {
                    o70Var2.u();
                    return;
                }
                return;
        }
    }
}
