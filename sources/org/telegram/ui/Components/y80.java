package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class y80 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.ActionBar.k1 {
    public final int f30566a;
    public final g90 f30567b;

    public y80(g90 g90Var, int i10) {
        this.f30566a = i10;
        this.f30567b = g90Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f30566a) {
            case 0:
                f90 f90Var = this.f30567b.f24410r;
                if (f90Var != null) {
                    f90Var.k();
                    return;
                }
                return;
            default:
                f90 f90Var2 = this.f30567b.f24410r;
                if (f90Var2 != null) {
                    f90Var2.e();
                    return;
                }
                return;
        }
    }

    @Override
    public void p(KeyEvent keyEvent) {
        g90 g90Var = this.f30567b;
        g90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && g90Var.f24411s.isShowing()) {
            g90Var.f24411s.d(true);
        }
    }
}
