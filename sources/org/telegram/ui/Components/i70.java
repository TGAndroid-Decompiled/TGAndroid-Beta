package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class i70 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.ActionBar.e1 {
    public final int f34553a;
    public final q70 f34554b;

    public i70(q70 q70Var, int i7) {
        this.f34553a = i7;
        this.f34554b = q70Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f34553a) {
            case 0:
                p70 p70Var = this.f34554b.f37299r;
                if (p70Var != null) {
                    p70Var.k();
                    return;
                }
                return;
            default:
                p70 p70Var2 = this.f34554b.f37299r;
                if (p70Var2 != null) {
                    p70Var2.e();
                    return;
                }
                return;
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        q70 q70Var = this.f34554b;
        q70Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && q70Var.f37300s.isShowing()) {
            q70Var.f37300s.d(true);
        }
    }
}
