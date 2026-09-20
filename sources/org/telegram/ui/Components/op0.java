package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class op0 implements r0.n, org.telegram.ui.ActionBar.l1 {
    public final int f27027a;
    public final uq0 f27028b;

    public op0(uq0 uq0Var, int i10) {
        this.f27027a = i10;
        this.f27028b = uq0Var;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        uq0 uq0Var = this.f27028b;
        uq0Var.processLegacyContainerInsets(g10);
        i0.b f7 = l1Var.f42154a.f(519);
        if (!uq0Var.G0.equals(f7)) {
            uq0Var.G0 = f7;
            uq0Var.container.requestLayout();
        }
        return r0.l1.f42153b;
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.f27027a) {
            case 1:
                uq0 uq0Var = this.f27028b;
                uq0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = uq0Var.J0) != null && n1Var.isShowing()) {
                    uq0Var.J0.d(true);
                    return;
                }
                return;
            default:
                uq0 uq0Var2 = this.f27028b;
                uq0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var2 = uq0Var2.J0) != null && n1Var2.isShowing()) {
                    uq0Var2.J0.d(true);
                    return;
                }
                return;
        }
    }
}
