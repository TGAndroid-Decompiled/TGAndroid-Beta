package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class y80 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.l1 {
    public final int f30580a;
    public final g90 f30581b;

    public y80(g90 g90Var, int i10) {
        this.f30580a = i10;
        this.f30581b = g90Var;
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f30580a) {
            case 0:
                f90 f90Var = this.f30581b.f24474r;
                if (f90Var != null) {
                    f90Var.i();
                    return;
                }
                return;
            default:
                f90 f90Var2 = this.f30581b.f24474r;
                if (f90Var2 != null) {
                    f90Var2.c();
                    return;
                }
                return;
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        g90 g90Var = this.f30581b;
        g90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && g90Var.f24475s.isShowing()) {
            g90Var.f24475s.d(true);
        }
    }
}
