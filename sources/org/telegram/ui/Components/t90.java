package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class t90 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.ActionBar.k1 {
    public final int f30800a;
    public final ba0 f30801b;

    public t90(ba0 ba0Var, int i10) {
        this.f30800a = i10;
        this.f30801b = ba0Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f30800a) {
            case 0:
                aa0 aa0Var = this.f30801b.f24586r;
                if (aa0Var != null) {
                    aa0Var.j();
                    return;
                }
                return;
            default:
                aa0 aa0Var2 = this.f30801b.f24586r;
                if (aa0Var2 != null) {
                    aa0Var2.c();
                    return;
                }
                return;
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        ba0 ba0Var = this.f30801b;
        ba0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && ba0Var.f24587s.isShowing()) {
            ba0Var.f24587s.d(true);
        }
    }
}
