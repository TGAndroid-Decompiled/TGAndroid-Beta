package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class j60 implements org.telegram.ui.ActionBar.e1 {
    public final int f36306a;
    public final x60 f36307b;

    public j60(x60 x60Var, int i7) {
        this.f36306a = i7;
        this.f36307b = x60Var;
    }

    @Override
    public final void m(KeyEvent keyEvent) {
        x60 x60Var;
        q60 q60Var;
        x60 x60Var2;
        q60 q60Var2;
        switch (this.f36306a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (q60Var = (x60Var = this.f36307b).f41881m) != null && q60Var.isShowing()) {
                    x60Var.v();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (q60Var2 = (x60Var2 = this.f36307b).f41881m) != null && q60Var2.isShowing()) {
                    x60Var2.v();
                    return;
                }
                return;
        }
    }
}
