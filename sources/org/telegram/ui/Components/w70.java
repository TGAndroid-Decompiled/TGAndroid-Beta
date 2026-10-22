package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class w70 implements org.telegram.ui.ActionBar.k1 {
    public final int f31987a;
    public final i80 f31988b;

    public w70(i80 i80Var, int i10) {
        this.f31987a = i10;
        this.f31988b = i80Var;
    }

    @Override
    public final void n(KeyEvent keyEvent) {
        i80 i80Var;
        d80 d80Var;
        i80 i80Var2;
        d80 d80Var2;
        switch (this.f31987a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (d80Var = (i80Var = this.f31988b).f27178m) != null && d80Var.isShowing()) {
                    i80Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (d80Var2 = (i80Var2 = this.f31988b).f27178m) != null && d80Var2.isShowing()) {
                    i80Var2.u();
                    return;
                }
                return;
        }
    }
}
