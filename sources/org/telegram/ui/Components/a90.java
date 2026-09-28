package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class a90 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.ActionBar.k1 {
    public final int f22617a;
    public final i90 f22618b;

    public a90(i90 i90Var, int i10) {
        this.f22617a = i10;
        this.f22618b = i90Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f22617a) {
            case 0:
                h90 h90Var = this.f22618b.f25043r;
                if (h90Var != null) {
                    h90Var.k();
                    return;
                }
                return;
            default:
                h90 h90Var2 = this.f22618b.f25043r;
                if (h90Var2 != null) {
                    h90Var2.e();
                    return;
                }
                return;
        }
    }

    @Override
    public void p(KeyEvent keyEvent) {
        i90 i90Var = this.f22618b;
        i90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && i90Var.f25044s.isShowing()) {
            i90Var.f25044s.d(true);
        }
    }
}
