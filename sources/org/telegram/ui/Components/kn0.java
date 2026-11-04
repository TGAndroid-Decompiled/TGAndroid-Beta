package org.telegram.ui.Components;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class kn0 implements pi.m, r0.m, org.telegram.ui.ActionBar.d1, pi.n {
    public final int f35452a;
    public final oo0 f35453b;

    public kn0(oo0 oo0Var, int i3) {
        this.f35452a = i3;
        this.f35453b = oo0Var;
    }

    @Override
    public r0.k1 R0(View view, r0.k1 k1Var) {
        WindowInsets g7 = k1Var.g();
        oo0 oo0Var = this.f35453b;
        oo0Var.t0(g7);
        i0.b f10 = k1Var.f54026a.f(519);
        if (!oo0Var.f36914z2.equals(f10)) {
            oo0Var.f36914z2 = f10;
            oo0Var.f28589c.requestLayout();
        }
        return r0.k1.f54025b;
    }

    @Override
    public int e() {
        oo0 oo0Var = this.f35453b;
        oo0Var.getClass();
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, oo0Var.J0);
    }

    @Override
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.f1 f1Var;
        org.telegram.ui.ActionBar.f1 f1Var2;
        switch (this.f35452a) {
            case 2:
                oo0 oo0Var = this.f35453b;
                oo0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (f1Var = oo0Var.C2) != null && f1Var.isShowing()) {
                    oo0Var.C2.d(true);
                    return;
                }
                return;
            default:
                oo0 oo0Var2 = this.f35453b;
                oo0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (f1Var2 = oo0Var2.C2) != null && f1Var2.isShowing()) {
                    oo0Var2.C2.d(true);
                    return;
                }
                return;
        }
    }

    @Override
    public void l(int i3) {
        oo0 oo0Var = this.f35453b;
        eh.g gVar = oo0Var.H2;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (x7.u.a(i3, 4)) {
                gVar.h(oo0Var.Y0.e());
            }
            gVar.e(oo0Var.M2, oo0Var.f28586b.getWidth(), oo0Var.f28586b.getHeight());
        }
    }
}
