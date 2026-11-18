package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class w70 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.ActionBar.f1 {
    public final int f41577a;
    public final e80 f41578b;

    public w70(e80 e80Var, int i7) {
        this.f41577a = i7;
        this.f41578b = e80Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f41577a) {
            case 0:
                d80 d80Var = this.f41578b.f34645r;
                if (d80Var != null) {
                    d80Var.i();
                    return;
                }
                return;
            default:
                d80 d80Var2 = this.f41578b.f34645r;
                if (d80Var2 != null) {
                    d80Var2.e();
                    return;
                }
                return;
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        e80 e80Var = this.f41578b;
        e80Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && e80Var.f34646s.isShowing()) {
            e80Var.f34646s.d(true);
        }
    }
}
