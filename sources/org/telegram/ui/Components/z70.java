package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class z70 implements org.telegram.ui.ActionBar.m1 {
    public final int f35234a;
    public final k80 f35235b;

    public z70(k80 k80Var, int i10) {
        this.f35234a = i10;
        this.f35235b = k80Var;
    }

    @Override
    public final void n(KeyEvent keyEvent) {
        k80 k80Var;
        f80 f80Var;
        k80 k80Var2;
        f80 f80Var2;
        switch (this.f35234a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (f80Var = (k80Var = this.f35235b).f29856m) != null && f80Var.isShowing()) {
                    k80Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (f80Var2 = (k80Var2 = this.f35235b).f29856m) != null && f80Var2.isShowing()) {
                    k80Var2.u();
                    return;
                }
                return;
        }
    }
}
