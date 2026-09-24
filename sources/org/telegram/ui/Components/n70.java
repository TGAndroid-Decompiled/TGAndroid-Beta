package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class n70 implements org.telegram.ui.ActionBar.k1 {
    public final int f26655a;
    public final y70 f26656b;

    public n70(y70 y70Var, int i10) {
        this.f26655a = i10;
        this.f26656b = y70Var;
    }

    @Override
    public final void p(KeyEvent keyEvent) {
        y70 y70Var;
        t70 t70Var;
        y70 y70Var2;
        t70 t70Var2;
        switch (this.f26655a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (t70Var = (y70Var = this.f26656b).f30537m) != null && t70Var.isShowing()) {
                    y70Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (t70Var2 = (y70Var2 = this.f26656b).f30537m) != null && t70Var2.isShowing()) {
                    y70Var2.u();
                    return;
                }
                return;
        }
    }
}
