package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class y60 implements org.telegram.ui.ActionBar.m1 {
    public final int f34933a;
    public final j70 f34934b;

    public y60(j70 j70Var, int i10) {
        this.f34933a = i10;
        this.f34934b = j70Var;
    }

    @Override
    public final void o(KeyEvent keyEvent) {
        j70 j70Var;
        e70 e70Var;
        j70 j70Var2;
        e70 e70Var2;
        switch (this.f34933a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (e70Var = (j70Var = this.f34934b).f29590m) != null && e70Var.isShowing()) {
                    j70Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (e70Var2 = (j70Var2 = this.f34934b).f29590m) != null && e70Var2.isShowing()) {
                    j70Var2.u();
                    return;
                }
                return;
        }
    }
}
