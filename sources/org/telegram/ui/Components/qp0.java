package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class qp0 implements r0.n, org.telegram.ui.ActionBar.k1 {
    public final int f27820a;
    public final wq0 f27821b;

    public qp0(wq0 wq0Var, int i10) {
        this.f27820a = i10;
        this.f27821b = wq0Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        wq0 wq0Var = this.f27821b;
        wq0Var.processLegacyContainerInsets(g10);
        i0.b f7 = l1Var.f42140a.f(519);
        if (!wq0Var.G0.equals(f7)) {
            wq0Var.G0 = f7;
            wq0Var.container.requestLayout();
        }
        return r0.l1.f42139b;
    }

    @Override
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f27820a) {
            case 1:
                wq0 wq0Var = this.f27821b;
                wq0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = wq0Var.J0) != null && m1Var.isShowing()) {
                    wq0Var.J0.d(true);
                    return;
                }
                return;
            default:
                wq0 wq0Var2 = this.f27821b;
                wq0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var2 = wq0Var2.J0) != null && m1Var2.isShowing()) {
                    wq0Var2.J0.d(true);
                    return;
                }
                return;
        }
    }
}
