package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class j80 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.ActionBar.m1 {
    public final int f29615a;
    public final r80 f29616b;

    public j80(r80 r80Var, int i10) {
        this.f29615a = i10;
        this.f29616b = r80Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f29615a) {
            case 0:
                q80 q80Var = this.f29616b.f32237r;
                if (q80Var != null) {
                    q80Var.k();
                    return;
                }
                return;
            default:
                q80 q80Var2 = this.f29616b.f32237r;
                if (q80Var2 != null) {
                    q80Var2.b();
                    return;
                }
                return;
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        r80 r80Var = this.f29616b;
        r80Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && r80Var.f32238s.isShowing()) {
            r80Var.f32238s.d(true);
        }
    }
}
