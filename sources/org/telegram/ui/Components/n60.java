package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class n60 implements org.telegram.ui.ActionBar.i1 {
    public final int f28692a;
    public final z60 f28693b;

    public n60(z60 z60Var, int i10) {
        this.f28692a = i10;
        this.f28693b = z60Var;
    }

    @Override
    public final void r(KeyEvent keyEvent) {
        z60 z60Var;
        u60 u60Var;
        z60 z60Var2;
        u60 u60Var2;
        switch (this.f28692a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (u60Var = (z60Var = this.f28693b).f32931m) != null && u60Var.isShowing()) {
                    z60Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (u60Var2 = (z60Var2 = this.f28693b).f32931m) != null && u60Var2.isShowing()) {
                    z60Var2.u();
                    return;
                }
                return;
        }
    }
}
