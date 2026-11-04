package org.telegram.ui;

import android.view.KeyEvent;
public final class dm0 implements org.telegram.ui.Components.r4, org.telegram.ui.ActionBar.d1 {
    public final int f44780a;
    public final hm0 f44781b;

    public dm0(hm0 hm0Var, int i3) {
        this.f44780a = i3;
        this.f44781b = hm0Var;
    }

    @Override
    public void L(int i3, int i10, boolean z10) {
        switch (this.f44780a) {
            case 0:
                hm0 hm0Var = this.f44781b;
                hm0Var.a0(hm0Var.f45936b, hm0Var.f45937c, z10, i3);
                hm0Var.finishFragment();
                return;
            default:
                hm0 hm0Var2 = this.f44781b;
                hm0Var2.a0(hm0Var2.f45936b, hm0Var2.f45937c, z10, i3);
                hm0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.f1 f1Var;
        hm0 hm0Var = this.f44781b;
        hm0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (f1Var = hm0Var.J) != null && f1Var.isShowing()) {
            hm0Var.J.d(true);
        }
    }
}
