package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class b80 implements org.telegram.ui.ActionBar.u1, org.telegram.ui.ActionBar.i1 {
    public final int f24681a;
    public final j80 f24682b;

    public b80(j80 j80Var, int i10) {
        this.f24681a = i10;
        this.f24682b = j80Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f24681a) {
            case 0:
                i80 i80Var = this.f24682b.f27306r;
                if (i80Var != null) {
                    i80Var.n();
                    return;
                }
                return;
            default:
                i80 i80Var2 = this.f24682b.f27306r;
                if (i80Var2 != null) {
                    i80Var2.d();
                    return;
                }
                return;
        }
    }

    @Override
    public void p(KeyEvent keyEvent) {
        j80 j80Var = this.f24682b;
        j80Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && j80Var.f27307s.isShowing()) {
            j80Var.f27307s.d(true);
        }
    }
}
