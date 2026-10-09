package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class p90 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.l1 {
    public final int f29803a;
    public final x90 f29804b;

    public p90(x90 x90Var, int i10) {
        this.f29803a = i10;
        this.f29804b = x90Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f29803a) {
            case 0:
                w90 w90Var = this.f29804b.f32786r;
                if (w90Var != null) {
                    w90Var.j();
                    return;
                }
                return;
            default:
                w90 w90Var2 = this.f29804b.f32786r;
                if (w90Var2 != null) {
                    w90Var2.c();
                    return;
                }
                return;
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        x90 x90Var = this.f29804b;
        x90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && x90Var.f32787s.isShowing()) {
            x90Var.f32787s.d(true);
        }
    }
}
