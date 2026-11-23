package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class y70 implements org.telegram.ui.ActionBar.q1, org.telegram.ui.ActionBar.e1 {
    public final int f42334a;
    public final g80 f42335b;

    public y70(g80 g80Var, int i7) {
        this.f42334a = i7;
        this.f42335b = g80Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f42334a) {
            case 0:
                f80 f80Var = this.f42335b.f35473r;
                if (f80Var != null) {
                    f80Var.i();
                    return;
                }
                return;
            default:
                f80 f80Var2 = this.f42335b.f35473r;
                if (f80Var2 != null) {
                    f80Var2.e();
                    return;
                }
                return;
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        g80 g80Var = this.f42335b;
        g80Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && g80Var.f35474s.isShowing()) {
            g80Var.f35474s.d(true);
        }
    }
}
