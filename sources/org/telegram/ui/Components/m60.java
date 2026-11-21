package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class m60 implements org.telegram.ui.ActionBar.e1 {
    public final int f37433a;
    public final a70 f37434b;

    public m60(a70 a70Var, int i7) {
        this.f37433a = i7;
        this.f37434b = a70Var;
    }

    @Override
    public final void j(KeyEvent keyEvent) {
        a70 a70Var;
        t60 t60Var;
        a70 a70Var2;
        t60 t60Var2;
        switch (this.f37433a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (t60Var = (a70Var = this.f37434b).f33373m) != null && t60Var.isShowing()) {
                    a70Var.v();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (t60Var2 = (a70Var2 = this.f37434b).f33373m) != null && t60Var2.isShowing()) {
                    a70Var2.v();
                    return;
                }
                return;
        }
    }
}
