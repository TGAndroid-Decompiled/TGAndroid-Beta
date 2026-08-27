package org.telegram.ui.Components;

import android.view.KeyEvent;

public final class q60 implements org.telegram.ui.ActionBar.l1 {

    public final int f31808a;

    public final b70 f31809b;

    public q60(b70 b70Var, int i10) {
        this.f31808a = i10;
        this.f31809b = b70Var;
    }

    @Override
    public final void k(KeyEvent keyEvent) {
        b70 b70Var;
        w60 w60Var;
        b70 b70Var2;
        w60 w60Var2;
        switch (this.f31808a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (w60Var = (b70Var = this.f31809b).f26982m) != null && w60Var.isShowing()) {
                    b70Var.u();
                    break;
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (w60Var2 = (b70Var2 = this.f31809b).f26982m) != null && w60Var2.isShowing()) {
                    b70Var2.u();
                    break;
                }
                break;
        }
    }
}
