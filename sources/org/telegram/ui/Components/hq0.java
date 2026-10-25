package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class hq0 implements oi.m, r0.n, org.telegram.ui.ActionBar.m1, oi.n {
    public final int f29036a;
    public final mr0 f29037b;

    public hq0(mr0 mr0Var, int i10) {
        this.f29036a = i10;
        this.f29037b = mr0Var;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        WindowInsets g7 = k1Var.g();
        mr0 mr0Var = this.f29037b;
        mr0Var.processLegacyContainerInsets(g7);
        i0.b f7 = k1Var.f47115a.f(519);
        if (!mr0Var.H0.equals(f7)) {
            mr0Var.H0 = f7;
            mr0Var.container.requestLayout();
        }
        return r0.k1.f47114b;
    }

    @Override
    public int f() {
        mr0 mr0Var = this.f29037b;
        mr0Var.getClass();
        return mr0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23354d6);
    }

    @Override
    public void k(int i10) {
        mr0.m(this.f29037b, i10);
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.f29036a) {
            case 2:
                mr0 mr0Var = this.f29037b;
                mr0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = mr0Var.K0) != null && o1Var.isShowing()) {
                    mr0Var.K0.d(true);
                    return;
                }
                return;
            default:
                mr0 mr0Var2 = this.f29037b;
                mr0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var2 = mr0Var2.K0) != null && o1Var2.isShowing()) {
                    mr0Var2.K0.d(true);
                    return;
                }
                return;
        }
    }
}
