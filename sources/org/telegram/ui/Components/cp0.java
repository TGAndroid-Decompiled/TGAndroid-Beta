package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class cp0 implements r0.n, org.telegram.ui.ActionBar.l1 {
    public final int f25073a;
    public final hq0 f25074b;

    public cp0(hq0 hq0Var, int i10) {
        this.f25073a = i10;
        this.f25074b = hq0Var;
    }

    @Override
    public r0.l1 T0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        hq0 hq0Var = this.f25074b;
        hq0Var.processLegacyContainerInsets(g10);
        i0.c f7 = l1Var.f44711a.f(519);
        if (!hq0Var.G0.equals(f7)) {
            hq0Var.G0 = f7;
            hq0Var.container.requestLayout();
        }
        return r0.l1.f44710b;
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.f25073a) {
            case 1:
                hq0 hq0Var = this.f25074b;
                hq0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = hq0Var.J0) != null && n1Var.isShowing()) {
                    hq0Var.J0.d(true);
                    return;
                }
                return;
            default:
                hq0 hq0Var2 = this.f25074b;
                hq0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var2 = hq0Var2.J0) != null && n1Var2.isShowing()) {
                    hq0Var2.J0.d(true);
                    return;
                }
                return;
        }
    }
}
