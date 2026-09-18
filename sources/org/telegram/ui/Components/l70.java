package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class l70 implements org.telegram.ui.ActionBar.l1 {
    public final int f26049a;
    public final w70 f26050b;

    public l70(w70 w70Var, int i10) {
        this.f26049a = i10;
        this.f26050b = w70Var;
    }

    @Override
    public final void p(KeyEvent keyEvent) {
        w70 w70Var;
        r70 r70Var;
        w70 w70Var2;
        r70 r70Var2;
        switch (this.f26049a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (r70Var = (w70Var = this.f26050b).f29914m) != null && r70Var.isShowing()) {
                    w70Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (r70Var2 = (w70Var2 = this.f26050b).f29914m) != null && r70Var2.isShowing()) {
                    w70Var2.u();
                    return;
                }
                return;
        }
    }
}
