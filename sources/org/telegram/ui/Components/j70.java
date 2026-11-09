package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class j70 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.ActionBar.e1 {
    public final int f34954a;
    public final r70 f34955b;

    public j70(r70 r70Var, int i7) {
        this.f34954a = i7;
        this.f34955b = r70Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f34954a) {
            case 0:
                q70 q70Var = this.f34955b.f37570r;
                if (q70Var != null) {
                    q70Var.k();
                    return;
                }
                return;
            default:
                q70 q70Var2 = this.f34955b.f37570r;
                if (q70Var2 != null) {
                    q70Var2.e();
                    return;
                }
                return;
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        r70 r70Var = this.f34955b;
        r70Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && r70Var.f37571s.isShowing()) {
            r70Var.f37571s.d(true);
        }
    }
}
