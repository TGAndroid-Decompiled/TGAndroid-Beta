package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class v70 implements org.telegram.ui.ActionBar.q1, org.telegram.ui.ActionBar.e1 {
    public final int f40578a;
    public final d80 f40579b;

    public v70(d80 d80Var, int i7) {
        this.f40578a = i7;
        this.f40579b = d80Var;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f40578a) {
            case 0:
                c80 c80Var = this.f40579b.f34240r;
                if (c80Var != null) {
                    c80Var.j();
                    return;
                }
                return;
            default:
                c80 c80Var2 = this.f40579b.f34240r;
                if (c80Var2 != null) {
                    c80Var2.e();
                    return;
                }
                return;
        }
    }

    @Override
    public void m(KeyEvent keyEvent) {
        d80 d80Var = this.f40579b;
        d80Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && d80Var.f34241s.isShowing()) {
            d80Var.f34241s.d(true);
        }
    }
}
