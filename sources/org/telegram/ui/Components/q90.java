package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class q90 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.ActionBar.k1 {
    public final int f30091a;
    public final y90 f30092b;

    public q90(y90 y90Var, int i10) {
        this.f30091a = i10;
        this.f30092b = y90Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f30091a) {
            case 0:
                x90 x90Var = this.f30092b.f33147r;
                if (x90Var != null) {
                    x90Var.j();
                    return;
                }
                return;
            default:
                x90 x90Var2 = this.f30092b.f33147r;
                if (x90Var2 != null) {
                    x90Var2.c();
                    return;
                }
                return;
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        y90 y90Var = this.f30092b;
        y90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && y90Var.f33148s.isShowing()) {
            y90Var.f33148s.d(true);
        }
    }
}
