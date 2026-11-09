package org.telegram.ui.Components;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class in0 implements oi.m, r0.m, org.telegram.ui.ActionBar.e1, oi.n {
    public final int f34820a;
    public final no0 f34821b;

    public in0(no0 no0Var, int i7) {
        this.f34820a = i7;
        this.f34821b = no0Var;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        no0 no0Var = this.f34821b;
        no0Var.t0(g10);
        i0.b f10 = k1Var.f54214a.f(519);
        if (!no0Var.f36468y2.equals(f10)) {
            no0Var.f36468y2 = f10;
            no0Var.f28627c.requestLayout();
        }
        return r0.k1.f54213b;
    }

    @Override
    public int h() {
        no0 no0Var = this.f34821b;
        no0Var.getClass();
        return org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27865d6, no0Var.I0);
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        switch (this.f34820a) {
            case 2:
                no0 no0Var = this.f34821b;
                no0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = no0Var.B2) != null && g1Var.isShowing()) {
                    no0Var.B2.d(true);
                    return;
                }
                return;
            default:
                no0 no0Var2 = this.f34821b;
                no0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var2 = no0Var2.B2) != null && g1Var2.isShowing()) {
                    no0Var2.B2.d(true);
                    return;
                }
                return;
        }
    }

    @Override
    public void l(int i7) {
        no0 no0Var = this.f34821b;
        dh.g gVar = no0Var.G2;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (c8.zc.a(i7, 4)) {
                gVar.h(no0Var.X0.e());
            }
            gVar.e(no0Var.L2, no0Var.f28624b.getWidth(), no0Var.f28624b.getHeight());
        }
    }
}
