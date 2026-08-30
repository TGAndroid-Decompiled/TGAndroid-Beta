package org.telegram.ui;

import android.view.KeyEvent;
public final class hp0 implements org.telegram.ui.Components.y4, org.telegram.ui.ActionBar.n1 {
    public final int f34928a;
    public final pp0 f34929b;

    public hp0(pp0 pp0Var, int i10) {
        this.f34928a = i10;
        this.f34929b = pp0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        switch (this.f34928a) {
            case 0:
                pp0 pp0Var = this.f34929b;
                pp0Var.V(pp0Var.f37428b, pp0Var.f37429c, z4, i10);
                pp0Var.finishFragment();
                return;
            default:
                pp0 pp0Var2 = this.f34929b;
                pp0Var2.V(pp0Var2.f37428b, pp0Var2.f37429c, z4, i10);
                pp0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        pp0 pp0Var = this.f34929b;
        pp0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = pp0Var.F) != null && p1Var.isShowing()) {
            pp0Var.F.d(true);
        }
    }
}
