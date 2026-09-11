package org.telegram.ui;

import android.view.KeyEvent;
public final class cq0 implements org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.l1 {
    public final int f35521a;
    public final kq0 f35522b;

    public cq0(kq0 kq0Var, int i10) {
        this.f35521a = i10;
        this.f35522b = kq0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f35521a) {
            case 0:
                kq0 kq0Var = this.f35522b;
                kq0Var.V(kq0Var.f38105b, kq0Var.f38106c, z10, i10);
                kq0Var.finishFragment();
                return;
            default:
                kq0 kq0Var2 = this.f35522b;
                kq0Var2.V(kq0Var2.f38105b, kq0Var2.f38106c, z10, i10);
                kq0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        kq0 kq0Var = this.f35522b;
        kq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = kq0Var.I) != null && n1Var.isShowing()) {
            kq0Var.I.d(true);
        }
    }
}
