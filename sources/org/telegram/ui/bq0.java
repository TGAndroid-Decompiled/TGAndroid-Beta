package org.telegram.ui;

import android.view.KeyEvent;
public final class bq0 implements org.telegram.ui.Components.f5, org.telegram.ui.ActionBar.l1 {
    public final int f36380a;
    public final kq0 f36381b;

    public bq0(kq0 kq0Var, int i10) {
        this.f36380a = i10;
        this.f36381b = kq0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f36380a) {
            case 0:
                kq0 kq0Var = this.f36381b;
                kq0Var.V(kq0Var.f39328b, kq0Var.f39329c, z10, i10);
                kq0Var.finishFragment();
                return;
            default:
                kq0 kq0Var2 = this.f36381b;
                kq0Var2.V(kq0Var2.f39328b, kq0Var2.f39329c, z10, i10);
                kq0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        kq0 kq0Var = this.f36381b;
        kq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = kq0Var.I) != null && n1Var.isShowing()) {
            kq0Var.I.d(true);
        }
    }
}
