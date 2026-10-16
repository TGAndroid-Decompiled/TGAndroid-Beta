package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class o90 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.ActionBar.k1 {
    public final int f27608a;
    public final w90 f27609b;

    public o90(w90 w90Var, int i10) {
        this.f27608a = i10;
        this.f27609b = w90Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f27608a) {
            case 0:
                v90 v90Var = this.f27609b.f30507r;
                if (v90Var != null) {
                    v90Var.j();
                    return;
                }
                return;
            default:
                v90 v90Var2 = this.f27609b.f30507r;
                if (v90Var2 != null) {
                    v90Var2.d();
                    return;
                }
                return;
        }
    }

    @Override
    public void n(KeyEvent keyEvent) {
        w90 w90Var = this.f27609b;
        w90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && w90Var.f30508s.isShowing()) {
            w90Var.f30508s.d(true);
        }
    }
}
