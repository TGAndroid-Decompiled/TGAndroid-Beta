package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class o70 implements org.telegram.ui.ActionBar.k1 {
    public final int f26989a;
    public final z70 f26990b;

    public o70(z70 z70Var, int i10) {
        this.f26989a = i10;
        this.f26990b = z70Var;
    }

    @Override
    public final void p(KeyEvent keyEvent) {
        z70 z70Var;
        u70 u70Var;
        z70 z70Var2;
        u70 u70Var2;
        switch (this.f26989a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (u70Var = (z70Var = this.f26990b).f30829m) != null && u70Var.isShowing()) {
                    z70Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (u70Var2 = (z70Var2 = this.f26990b).f30829m) != null && u70Var2.isShowing()) {
                    z70Var2.u();
                    return;
                }
                return;
        }
    }
}
