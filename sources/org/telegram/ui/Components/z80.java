package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class z80 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.ActionBar.k1 {
    public final int f30852a;
    public final h90 f30853b;

    public z80(h90 h90Var, int i10) {
        this.f30852a = i10;
        this.f30853b = h90Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f30852a) {
            case 0:
                g90 g90Var = this.f30853b.f24731r;
                if (g90Var != null) {
                    g90Var.k();
                    return;
                }
                return;
            default:
                g90 g90Var2 = this.f30853b.f24731r;
                if (g90Var2 != null) {
                    g90Var2.e();
                    return;
                }
                return;
        }
    }

    @Override
    public void p(KeyEvent keyEvent) {
        h90 h90Var = this.f30853b;
        h90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && h90Var.f24732s.isShowing()) {
            h90Var.f24732s.d(true);
        }
    }
}
