package org.telegram.ui;

import android.view.KeyEvent;
public final class jp0 implements org.telegram.ui.Components.y4, org.telegram.ui.ActionBar.n1 {
    public final int f38196a;
    public final rp0 f38197b;

    public jp0(rp0 rp0Var, int i10) {
        this.f38196a = i10;
        this.f38197b = rp0Var;
    }

    @Override
    public void I(int i10, int i11, boolean z4) {
        switch (this.f38196a) {
            case 0:
                rp0 rp0Var = this.f38197b;
                rp0Var.V(rp0Var.f41025b, rp0Var.f41026c, z4, i10);
                rp0Var.finishFragment();
                return;
            default:
                rp0 rp0Var2 = this.f38197b;
                rp0Var2.V(rp0Var2.f41025b, rp0Var2.f41026c, z4, i10);
                rp0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        rp0 rp0Var = this.f38197b;
        rp0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = rp0Var.F) != null && p1Var.isShowing()) {
            rp0Var.F.d(true);
        }
    }
}
