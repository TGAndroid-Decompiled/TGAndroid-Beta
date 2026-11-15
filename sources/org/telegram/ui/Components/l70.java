package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class l70 implements org.telegram.ui.ActionBar.q1, org.telegram.ui.ActionBar.e1 {
    public final int f36731a;
    public final t70 f36732b;

    public l70(t70 t70Var, int i7) {
        this.f36731a = i7;
        this.f36732b = t70Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f36731a) {
            case 0:
                s70 s70Var = this.f36732b.f39582r;
                if (s70Var != null) {
                    s70Var.j();
                    return;
                }
                return;
            default:
                s70 s70Var2 = this.f36732b.f39582r;
                if (s70Var2 != null) {
                    s70Var2.e();
                    return;
                }
                return;
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        t70 t70Var = this.f36732b;
        t70Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && t70Var.f39583s.isShowing()) {
            t70Var.f39583s.d(true);
        }
    }
}
