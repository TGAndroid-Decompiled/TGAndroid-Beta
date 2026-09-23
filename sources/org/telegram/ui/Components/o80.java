package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class o80 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.l1 {
    public final int f26681a;
    public final w80 f26682b;

    public o80(w80 w80Var, int i10) {
        this.f26681a = i10;
        this.f26682b = w80Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f26681a) {
            case 0:
                v80 v80Var = this.f26682b.f29572r;
                if (v80Var != null) {
                    v80Var.j();
                    return;
                }
                return;
            default:
                v80 v80Var2 = this.f26682b.f29572r;
                if (v80Var2 != null) {
                    v80Var2.c();
                    return;
                }
                return;
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        w80 w80Var = this.f26682b;
        w80Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && w80Var.f29573s.isShowing()) {
            w80Var.f29573s.d(true);
        }
    }
}
