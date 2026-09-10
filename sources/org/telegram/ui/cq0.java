package org.telegram.ui;

import android.view.KeyEvent;
public final class cq0 implements org.telegram.ui.Components.c5, org.telegram.ui.ActionBar.n1 {
    public final int f31757a;
    public final kq0 f31758b;

    public cq0(kq0 kq0Var, int i10) {
        this.f31757a = i10;
        this.f31758b = kq0Var;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        switch (this.f31757a) {
            case 0:
                kq0 kq0Var = this.f31758b;
                kq0Var.V(kq0Var.f34439b, kq0Var.f34440c, z10, i10);
                kq0Var.finishFragment();
                return;
            default:
                kq0 kq0Var2 = this.f31758b;
                kq0Var2.V(kq0Var2.f34439b, kq0Var2.f34440c, z10, i10);
                kq0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        kq0 kq0Var = this.f31758b;
        kq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = kq0Var.I) != null && p1Var.isShowing()) {
            kq0Var.I.d(true);
        }
    }
}
