package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class w70 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.ActionBar.m1 {
    public final int f34135a;
    public final e80 f34136b;

    public w70(e80 e80Var, int i9) {
        this.f34135a = i9;
        this.f34136b = e80Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f34135a) {
            case 0:
                d80 d80Var = this.f34136b.f27973r;
                if (d80Var != null) {
                    d80Var.k();
                    return;
                }
                return;
            default:
                d80 d80Var2 = this.f34136b.f27973r;
                if (d80Var2 != null) {
                    d80Var2.c();
                    return;
                }
                return;
        }
    }

    @Override
    public void k(KeyEvent keyEvent) {
        e80 e80Var = this.f34136b;
        e80Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && e80Var.f27974s.isShowing()) {
            e80Var.f27974s.d(true);
        }
    }
}
