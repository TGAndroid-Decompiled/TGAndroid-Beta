package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class n80 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.l1 {
    public final int f28687a;
    public final w80 f28688b;

    public n80(w80 w80Var, int i10) {
        this.f28687a = i10;
        this.f28688b = w80Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f28687a) {
            case 0:
                v80 v80Var = this.f28688b.f32205r;
                if (v80Var != null) {
                    v80Var.j();
                    return;
                }
                return;
            default:
                v80 v80Var2 = this.f28688b.f32205r;
                if (v80Var2 != null) {
                    v80Var2.c();
                    return;
                }
                return;
        }
    }

    @Override
    public void n(KeyEvent keyEvent) {
        w80 w80Var = this.f28688b;
        w80Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && w80Var.f32206s.isShowing()) {
            w80Var.f32206s.d(true);
        }
    }
}
