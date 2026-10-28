package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class iq0 implements oi.m, r0.n, org.telegram.ui.ActionBar.m1, oi.n {
    public final int f29403a;
    public final nr0 f29404b;

    public iq0(nr0 nr0Var, int i10) {
        this.f29403a = i10;
        this.f29404b = nr0Var;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        WindowInsets g7 = k1Var.g();
        nr0 nr0Var = this.f29404b;
        nr0Var.processLegacyContainerInsets(g7);
        i0.b f7 = k1Var.f47153a.f(519);
        if (!nr0Var.H0.equals(f7)) {
            nr0Var.H0 = f7;
            nr0Var.container.requestLayout();
        }
        return r0.k1.f47152b;
    }

    @Override
    public int f() {
        nr0 nr0Var = this.f29404b;
        nr0Var.getClass();
        return nr0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6);
    }

    @Override
    public void k(int i10) {
        nr0.m(this.f29404b, i10);
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.f29403a) {
            case 2:
                nr0 nr0Var = this.f29404b;
                nr0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = nr0Var.K0) != null && o1Var.isShowing()) {
                    nr0Var.K0.d(true);
                    return;
                }
                return;
            default:
                nr0 nr0Var2 = this.f29404b;
                nr0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var2 = nr0Var2.K0) != null && o1Var2.isShowing()) {
                    nr0Var2.K0.d(true);
                    return;
                }
                return;
        }
    }
}
