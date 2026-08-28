package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class l60 implements org.telegram.ui.ActionBar.m1 {
    public final int f30384a;
    public final x60 f30385b;

    public l60(x60 x60Var, int i9) {
        this.f30384a = i9;
        this.f30385b = x60Var;
    }

    @Override
    public final void k(KeyEvent keyEvent) {
        x60 x60Var;
        s60 s60Var;
        x60 x60Var2;
        s60 s60Var2;
        switch (this.f30384a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (s60Var = (x60Var = this.f30385b).f34570m) != null && s60Var.isShowing()) {
                    x60Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (s60Var2 = (x60Var2 = this.f30385b).f34570m) != null && s60Var2.isShowing()) {
                    x60Var2.u();
                    return;
                }
                return;
        }
    }
}
