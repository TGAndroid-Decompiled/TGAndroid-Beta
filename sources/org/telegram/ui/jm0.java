package org.telegram.ui;

import android.view.KeyEvent;
public final class jm0 implements org.telegram.ui.Components.r4, org.telegram.ui.ActionBar.e1 {
    public final int f48428a;
    public final nm0 f48429b;

    public jm0(nm0 nm0Var, int i7) {
        this.f48428a = i7;
        this.f48429b = nm0Var;
    }

    @Override
    public void L(int i7, int i10, boolean z10) {
        switch (this.f48428a) {
            case 0:
                nm0 nm0Var = this.f48429b;
                nm0Var.a0(nm0Var.f49584b, nm0Var.f49585c, z10, i7);
                nm0Var.finishFragment();
                return;
            default:
                nm0 nm0Var2 = this.f48429b;
                nm0Var2.a0(nm0Var2.f49584b, nm0Var2.f49585c, z10, i7);
                nm0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        nm0 nm0Var = this.f48429b;
        nm0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = nm0Var.J) != null && g1Var.isShowing()) {
            nm0Var.J.d(true);
        }
    }
}
