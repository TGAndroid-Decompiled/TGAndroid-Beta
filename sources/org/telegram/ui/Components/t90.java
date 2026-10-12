package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class t90 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.ActionBar.k1 {
    public final int f30797a;
    public final ba0 f30798b;

    public t90(ba0 ba0Var, int i10) {
        this.f30797a = i10;
        this.f30798b = ba0Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f30797a) {
            case 0:
                aa0 aa0Var = this.f30798b.f24598r;
                if (aa0Var != null) {
                    aa0Var.j();
                    return;
                }
                return;
            default:
                aa0 aa0Var2 = this.f30798b.f24598r;
                if (aa0Var2 != null) {
                    aa0Var2.c();
                    return;
                }
                return;
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        ba0 ba0Var = this.f30798b;
        ba0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && ba0Var.f24599s.isShowing()) {
            ba0Var.f24599s.d(true);
        }
    }
}
