package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class rp0 implements r0.n, org.telegram.ui.ActionBar.k1 {
    public final int f28117a;
    public final xq0 f28118b;

    public rp0(xq0 xq0Var, int i10) {
        this.f28117a = i10;
        this.f28118b = xq0Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        xq0 xq0Var = this.f28118b;
        xq0Var.processLegacyContainerInsets(g10);
        i0.b f7 = l1Var.f42245a.f(519);
        if (!xq0Var.G0.equals(f7)) {
            xq0Var.G0 = f7;
            xq0Var.container.requestLayout();
        }
        return r0.l1.f42244b;
    }

    @Override
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f28117a) {
            case 1:
                xq0 xq0Var = this.f28118b;
                xq0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = xq0Var.J0) != null && m1Var.isShowing()) {
                    xq0Var.J0.d(true);
                    return;
                }
                return;
            default:
                xq0 xq0Var2 = this.f28118b;
                xq0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var2 = xq0Var2.J0) != null && m1Var2.isShowing()) {
                    xq0Var2.J0.d(true);
                    return;
                }
                return;
        }
    }
}
