package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class f80 implements org.telegram.ui.ActionBar.k1 {
    public final int f26290a;
    public final q80 f26291b;

    public f80(q80 q80Var, int i10) {
        this.f26290a = i10;
        this.f26291b = q80Var;
    }

    @Override
    public final void o(KeyEvent keyEvent) {
        q80 q80Var;
        l80 l80Var;
        q80 q80Var2;
        l80 l80Var2;
        switch (this.f26290a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (l80Var = (q80Var = this.f26291b).f30073m) != null && l80Var.isShowing()) {
                    q80Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (l80Var2 = (q80Var2 = this.f26291b).f30073m) != null && l80Var2.isShowing()) {
                    q80Var2.u();
                    return;
                }
                return;
        }
    }
}
