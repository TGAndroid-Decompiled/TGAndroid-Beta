package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class c70 implements org.telegram.ui.ActionBar.l1 {
    public final int f24914a;
    public final n70 f24915b;

    public c70(n70 n70Var, int i10) {
        this.f24914a = i10;
        this.f24915b = n70Var;
    }

    @Override
    public final void n(KeyEvent keyEvent) {
        n70 n70Var;
        i70 i70Var;
        n70 n70Var2;
        i70 i70Var2;
        switch (this.f24914a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (i70Var = (n70Var = this.f24915b).f28651m) != null && i70Var.isShowing()) {
                    n70Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (i70Var2 = (n70Var2 = this.f24915b).f28651m) != null && i70Var2.isShowing()) {
                    n70Var2.u();
                    return;
                }
                return;
        }
    }
}
