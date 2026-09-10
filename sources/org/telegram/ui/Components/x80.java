package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class x80 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.ActionBar.n1 {
    public final int f28975a;
    public final f90 f28976b;

    public x80(f90 f90Var, int i10) {
        this.f28975a = i10;
        this.f28976b = f90Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f28975a) {
            case 0:
                e90 e90Var = this.f28976b.f22952r;
                if (e90Var != null) {
                    e90Var.j();
                    return;
                }
                return;
            default:
                e90 e90Var2 = this.f28976b.f22952r;
                if (e90Var2 != null) {
                    e90Var2.e();
                    return;
                }
                return;
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        f90 f90Var = this.f28976b;
        f90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && f90Var.f22953s.isShowing()) {
            f90Var.f22953s.d(true);
        }
    }
}
