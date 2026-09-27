package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class a90 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.ActionBar.m1 {
    public final int f22620a;
    public final i90 f22621b;

    public a90(i90 i90Var, int i10) {
        this.f22620a = i10;
        this.f22621b = i90Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f22620a) {
            case 0:
                h90 h90Var = this.f22621b.f25060r;
                if (h90Var != null) {
                    h90Var.j();
                    return;
                }
                return;
            default:
                h90 h90Var2 = this.f22621b.f25060r;
                if (h90Var2 != null) {
                    h90Var2.e();
                    return;
                }
                return;
        }
    }

    @Override
    public void p(KeyEvent keyEvent) {
        i90 i90Var = this.f22621b;
        i90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && i90Var.f25061s.isShowing()) {
            i90Var.f25061s.d(true);
        }
    }
}
