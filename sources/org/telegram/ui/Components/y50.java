package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class y50 implements org.telegram.ui.ActionBar.e1 {
    public final int f40531a;
    public final k60 f40532b;

    public y50(k60 k60Var, int i7) {
        this.f40531a = i7;
        this.f40532b = k60Var;
    }

    @Override
    public final void j(KeyEvent keyEvent) {
        k60 k60Var;
        f60 f60Var;
        k60 k60Var2;
        f60 f60Var2;
        switch (this.f40531a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (f60Var = (k60Var = this.f40532b).f35170m) != null && f60Var.isShowing()) {
                    k60Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (f60Var2 = (k60Var2 = this.f40532b).f35170m) != null && f60Var2.isShowing()) {
                    k60Var2.u();
                    return;
                }
                return;
        }
    }
}
