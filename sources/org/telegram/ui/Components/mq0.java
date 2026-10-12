package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class mq0 implements r0.n, org.telegram.ui.ActionBar.k1 {
    public final int f28632a;
    public final sr0 f28633b;

    public mq0(sr0 sr0Var, int i10) {
        this.f28632a = i10;
        this.f28633b = sr0Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        sr0 sr0Var = this.f28633b;
        sr0Var.processLegacyContainerInsets(g10);
        i0.b f7 = k1Var.f47000a.f(519);
        if (!sr0Var.G0.equals(f7)) {
            sr0Var.G0 = f7;
            sr0Var.container.requestLayout();
        }
        return r0.k1.f46999b;
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f28632a) {
            case 1:
                sr0 sr0Var = this.f28633b;
                sr0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = sr0Var.J0) != null && m1Var.isShowing()) {
                    sr0Var.J0.d(true);
                    return;
                }
                return;
            default:
                sr0 sr0Var2 = this.f28633b;
                sr0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var2 = sr0Var2.J0) != null && m1Var2.isShowing()) {
                    sr0Var2.J0.d(true);
                    return;
                }
                return;
        }
    }
}
