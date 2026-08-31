package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class q80 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.ActionBar.n1 {
    public final int f30340a;
    public final y80 f30341b;

    public q80(y80 y80Var, int i10) {
        this.f30340a = i10;
        this.f30341b = y80Var;
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f30340a) {
            case 0:
                x80 x80Var = this.f30341b.f33410r;
                if (x80Var != null) {
                    x80Var.k();
                    return;
                }
                return;
            default:
                x80 x80Var2 = this.f30341b.f33410r;
                if (x80Var2 != null) {
                    x80Var2.c();
                    return;
                }
                return;
        }
    }

    @Override
    public void n(KeyEvent keyEvent) {
        y80 y80Var = this.f30341b;
        y80Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && y80Var.f33411s.isShowing()) {
            y80Var.f33411s.d(true);
        }
    }
}
