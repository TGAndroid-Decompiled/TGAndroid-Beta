package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class mp0 implements r0.n, org.telegram.ui.ActionBar.n1 {
    public final int f25265a;
    public final sq0 f25266b;

    public mp0(sq0 sq0Var, int i10) {
        this.f25265a = i10;
        this.f25266b = sq0Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        sq0 sq0Var = this.f25266b;
        sq0Var.processLegacyContainerInsets(g10);
        i0.c f7 = l1Var.f41074a.f(519);
        if (!sq0Var.G0.equals(f7)) {
            sq0Var.G0 = f7;
            sq0Var.container.requestLayout();
        }
        return r0.l1.f41073b;
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        org.telegram.ui.ActionBar.p1 p1Var2;
        switch (this.f25265a) {
            case 1:
                sq0 sq0Var = this.f25266b;
                sq0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = sq0Var.J0) != null && p1Var.isShowing()) {
                    sq0Var.J0.d(true);
                    return;
                }
                return;
            default:
                sq0 sq0Var2 = this.f25266b;
                sq0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var2 = sq0Var2.J0) != null && p1Var2.isShowing()) {
                    sq0Var2.J0.d(true);
                    return;
                }
                return;
        }
    }
}
