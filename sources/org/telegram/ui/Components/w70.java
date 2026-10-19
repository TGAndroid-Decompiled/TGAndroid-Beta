package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class w70 implements org.telegram.ui.ActionBar.k1 {
    public final int f32028a;
    public final i80 f32029b;

    public w70(i80 i80Var, int i10) {
        this.f32028a = i10;
        this.f32029b = i80Var;
    }

    @Override
    public final void n(KeyEvent keyEvent) {
        i80 i80Var;
        d80 d80Var;
        i80 i80Var2;
        d80 d80Var2;
        switch (this.f32028a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (d80Var = (i80Var = this.f32029b).f27124m) != null && d80Var.isShowing()) {
                    i80Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (d80Var2 = (i80Var2 = this.f32029b).f27124m) != null && d80Var2.isShowing()) {
                    i80Var2.u();
                    return;
                }
                return;
        }
    }
}
