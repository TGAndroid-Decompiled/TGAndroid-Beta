package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class ko0 implements r0.o, org.telegram.ui.ActionBar.m1 {
    public final int f30209a;
    public final rp0 f30210b;

    public ko0(rp0 rp0Var, int i9) {
        this.f30209a = i9;
        this.f30210b = rp0Var;
    }

    @Override
    public r0.m1 L0(View view, r0.m1 m1Var) {
        WindowInsets g10 = m1Var.g();
        rp0 rp0Var = this.f30210b;
        rp0Var.processLegacyContainerInsets(g10);
        i0.b f10 = m1Var.f46929a.f(519);
        if (!rp0Var.C0.equals(f10)) {
            rp0Var.C0 = f10;
            rp0Var.container.requestLayout();
        }
        return r0.m1.f46928b;
    }

    @Override
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.f30209a) {
            case 1:
                rp0 rp0Var = this.f30210b;
                rp0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = rp0Var.F0) != null && o1Var.isShowing()) {
                    rp0Var.F0.d(true);
                    return;
                }
                return;
            default:
                rp0 rp0Var2 = this.f30210b;
                rp0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var2 = rp0Var2.F0) != null && o1Var2.isShowing()) {
                    rp0Var2.F0.d(true);
                    return;
                }
                return;
        }
    }
}
