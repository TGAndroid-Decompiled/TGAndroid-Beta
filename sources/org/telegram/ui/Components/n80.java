package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class n80 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.ActionBar.m1 {
    public final int f26399a;
    public final v80 f26400b;

    public n80(v80 v80Var, int i10) {
        this.f26399a = i10;
        this.f26400b = v80Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f26399a) {
            case 0:
                u80 u80Var = this.f26400b.f28655r;
                if (u80Var != null) {
                    u80Var.j();
                    return;
                }
                return;
            default:
                u80 u80Var2 = this.f26400b.f28655r;
                if (u80Var2 != null) {
                    u80Var2.c();
                    return;
                }
                return;
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        v80 v80Var = this.f26400b;
        v80Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && v80Var.f28656s.isShowing()) {
            v80Var.f28656s.d(true);
        }
    }
}
