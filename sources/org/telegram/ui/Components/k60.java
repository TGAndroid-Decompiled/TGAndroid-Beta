package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class k60 implements org.telegram.ui.ActionBar.f1 {
    public final int f36690a;
    public final y60 f36691b;

    public k60(y60 y60Var, int i7) {
        this.f36690a = i7;
        this.f36691b = y60Var;
    }

    @Override
    public final void j(KeyEvent keyEvent) {
        y60 y60Var;
        r60 r60Var;
        y60 y60Var2;
        r60 r60Var2;
        switch (this.f36690a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (r60Var = (y60Var = this.f36691b).f42364m) != null && r60Var.isShowing()) {
                    y60Var.v();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (r60Var2 = (y60Var2 = this.f36691b).f42364m) != null && r60Var2.isShowing()) {
                    y60Var2.v();
                    return;
                }
                return;
        }
    }
}
