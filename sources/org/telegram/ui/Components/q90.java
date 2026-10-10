package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class q90 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.l1 {
    public final int f30128a;
    public final y90 f30129b;

    public q90(y90 y90Var, int i10) {
        this.f30128a = i10;
        this.f30129b = y90Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f30128a) {
            case 0:
                x90 x90Var = this.f30129b.f33152r;
                if (x90Var != null) {
                    x90Var.j();
                    return;
                }
                return;
            default:
                x90 x90Var2 = this.f30129b.f33152r;
                if (x90Var2 != null) {
                    x90Var2.c();
                    return;
                }
                return;
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        y90 y90Var = this.f30129b;
        y90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && y90Var.f33153s.isShowing()) {
            y90Var.f33153s.d(true);
        }
    }
}
