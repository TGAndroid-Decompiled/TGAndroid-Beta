package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class h90 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.k1 {
    public final int f26836a;
    public final q90 f26837b;

    public h90(q90 q90Var, int i10) {
        this.f26836a = i10;
        this.f26837b = q90Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f26836a) {
            case 0:
                p90 p90Var = this.f26837b.f29505r;
                if (p90Var != null) {
                    p90Var.k();
                    return;
                }
                return;
            default:
                p90 p90Var2 = this.f26837b.f29505r;
                if (p90Var2 != null) {
                    p90Var2.d();
                    return;
                }
                return;
        }
    }

    @Override
    public void n(KeyEvent keyEvent) {
        q90 q90Var = this.f26837b;
        q90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && q90Var.f29506s.isShowing()) {
            q90Var.f29506s.d(true);
        }
    }
}
