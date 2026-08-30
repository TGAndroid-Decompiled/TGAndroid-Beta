package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class d70 implements org.telegram.ui.ActionBar.n1 {
    public final int f24183a;
    public final o70 f24184b;

    public d70(o70 o70Var, int i10) {
        this.f24183a = i10;
        this.f24184b = o70Var;
    }

    @Override
    public final void n(KeyEvent keyEvent) {
        o70 o70Var;
        j70 j70Var;
        o70 o70Var2;
        j70 j70Var2;
        switch (this.f24183a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (j70Var = (o70Var = this.f24184b).f27479m) != null && j70Var.isShowing()) {
                    o70Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (j70Var2 = (o70Var2 = this.f24184b).f27479m) != null && j70Var2.isShowing()) {
                    o70Var2.u();
                    return;
                }
                return;
        }
    }
}
