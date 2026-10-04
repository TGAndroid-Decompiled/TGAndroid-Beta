package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class q70 implements org.telegram.ui.ActionBar.l1 {
    public final int f29945a;
    public final b80 f29946b;

    public q70(b80 b80Var, int i10) {
        this.f29945a = i10;
        this.f29946b = b80Var;
    }

    @Override
    public final void o(KeyEvent keyEvent) {
        b80 b80Var;
        w70 w70Var;
        b80 b80Var2;
        w70 w70Var2;
        switch (this.f29945a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (w70Var = (b80Var = this.f29946b).f24839m) != null && w70Var.isShowing()) {
                    b80Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (w70Var2 = (b80Var2 = this.f29946b).f24839m) != null && w70Var2.isShowing()) {
                    b80Var2.u();
                    return;
                }
                return;
        }
    }
}
