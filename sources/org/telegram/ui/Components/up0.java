package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class up0 implements li.i, r0.n, org.telegram.ui.ActionBar.l1, li.j {
    public final int f31418a;
    public final zq0 f31419b;

    public up0(zq0 zq0Var, int i10) {
        this.f31418a = i10;
        this.f31419b = zq0Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        zq0 zq0Var = this.f31419b;
        zq0Var.processLegacyContainerInsets(g10);
        i0.b f7 = l1Var.f45610a.f(519);
        if (!zq0Var.G0.equals(f7)) {
            zq0Var.G0 = f7;
            zq0Var.container.requestLayout();
        }
        return r0.l1.f45609b;
    }

    @Override
    public int f() {
        zq0 zq0Var = this.f31419b;
        zq0Var.getClass();
        return zq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20818d6);
    }

    @Override
    public void k(int i10) {
        zq0.m(this.f31419b, i10);
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.f31418a) {
            case 2:
                zq0 zq0Var = this.f31419b;
                zq0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = zq0Var.J0) != null && n1Var.isShowing()) {
                    zq0Var.J0.d(true);
                    return;
                }
                return;
            default:
                zq0 zq0Var2 = this.f31419b;
                zq0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var2 = zq0Var2.J0) != null && n1Var2.isShowing()) {
                    zq0Var2.J0.d(true);
                    return;
                }
                return;
        }
    }
}
