package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class l70 implements org.telegram.ui.ActionBar.q1, org.telegram.ui.ActionBar.e1 {
    public final int f36719a;
    public final t70 f36720b;

    public l70(t70 t70Var, int i7) {
        this.f36719a = i7;
        this.f36720b = t70Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f36719a) {
            case 0:
                s70 s70Var = this.f36720b.f39580r;
                if (s70Var != null) {
                    s70Var.j();
                    return;
                }
                return;
            default:
                s70 s70Var2 = this.f36720b.f39580r;
                if (s70Var2 != null) {
                    s70Var2.e();
                    return;
                }
                return;
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        t70 t70Var = this.f36720b;
        t70Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && t70Var.f39581s.isShowing()) {
            t70Var.f39581s.d(true);
        }
    }
}
