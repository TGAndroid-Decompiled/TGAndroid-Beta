package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class n80 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.l1 {
    public final int f26393a;
    public final v80 f26394b;

    public n80(v80 v80Var, int i10) {
        this.f26393a = i10;
        this.f26394b = v80Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f26393a) {
            case 0:
                u80 u80Var = this.f26394b.f28656r;
                if (u80Var != null) {
                    u80Var.j();
                    return;
                }
                return;
            default:
                u80 u80Var2 = this.f26394b.f28656r;
                if (u80Var2 != null) {
                    u80Var2.c();
                    return;
                }
                return;
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        v80 v80Var = this.f26394b;
        v80Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && v80Var.f28657s.isShowing()) {
            v80Var.f28657s.d(true);
        }
    }
}
