package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class p90 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.ActionBar.k1 {
    public final int f29793a;
    public final x90 f29794b;

    public p90(x90 x90Var, int i10) {
        this.f29793a = i10;
        this.f29794b = x90Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f29793a) {
            case 0:
                w90 w90Var = this.f29794b.f32918r;
                if (w90Var != null) {
                    w90Var.j();
                    return;
                }
                return;
            default:
                w90 w90Var2 = this.f29794b.f32918r;
                if (w90Var2 != null) {
                    w90Var2.c();
                    return;
                }
                return;
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        x90 x90Var = this.f29794b;
        x90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && x90Var.f32919s.isShowing()) {
            x90Var.f32919s.d(true);
        }
    }
}
