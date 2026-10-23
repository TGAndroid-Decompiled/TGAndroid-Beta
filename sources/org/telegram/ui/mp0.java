package org.telegram.ui;

import android.view.KeyEvent;
public final class mp0 implements org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.k1 {
    public final int f39638a;
    public final vp0 f39639b;

    public mp0(vp0 vp0Var, int i10) {
        this.f39638a = i10;
        this.f39639b = vp0Var;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        switch (this.f39638a) {
            case 0:
                vp0 vp0Var = this.f39639b;
                vp0Var.V(vp0Var.f42805b, vp0Var.f42806c, z10, i10);
                vp0Var.finishFragment();
                return;
            default:
                vp0 vp0Var2 = this.f39639b;
                vp0Var2.V(vp0Var2.f42805b, vp0Var2.f42806c, z10, i10);
                vp0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        vp0 vp0Var = this.f39639b;
        vp0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = vp0Var.I) != null && m1Var.isShowing()) {
            vp0Var.I.d(true);
        }
    }
}
