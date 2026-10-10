package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class f80 implements org.telegram.ui.ActionBar.l1 {
    public final int f26347a;
    public final q80 f26348b;

    public f80(q80 q80Var, int i10) {
        this.f26347a = i10;
        this.f26348b = q80Var;
    }

    @Override
    public final void o(KeyEvent keyEvent) {
        q80 q80Var;
        l80 l80Var;
        q80 q80Var2;
        l80 l80Var2;
        switch (this.f26347a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (l80Var = (q80Var = this.f26348b).f30110m) != null && l80Var.isShowing()) {
                    q80Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (l80Var2 = (q80Var2 = this.f26348b).f30110m) != null && l80Var2.isShowing()) {
                    q80Var2.u();
                    return;
                }
                return;
        }
    }
}
