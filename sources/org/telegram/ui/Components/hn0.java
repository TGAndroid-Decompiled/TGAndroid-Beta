package org.telegram.ui.Components;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class hn0 implements oi.m, r0.m, org.telegram.ui.ActionBar.e1, oi.n {
    public final int f34420a;
    public final mo0 f34421b;

    public hn0(mo0 mo0Var, int i7) {
        this.f34420a = i7;
        this.f34421b = mo0Var;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        mo0 mo0Var = this.f34421b;
        mo0Var.t0(g10);
        i0.b f10 = k1Var.f54213a.f(519);
        if (!mo0Var.B2.equals(f10)) {
            mo0Var.B2 = f10;
            mo0Var.f28675c.requestLayout();
        }
        return r0.k1.f54212b;
    }

    @Override
    public int h() {
        mo0 mo0Var = this.f34421b;
        mo0Var.getClass();
        return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27890d6, mo0Var.I0);
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        switch (this.f34420a) {
            case 2:
                mo0 mo0Var = this.f34421b;
                mo0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = mo0Var.E2) != null && g1Var.isShowing()) {
                    mo0Var.E2.d(true);
                    return;
                }
                return;
            default:
                mo0 mo0Var2 = this.f34421b;
                mo0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var2 = mo0Var2.E2) != null && g1Var2.isShowing()) {
                    mo0Var2.E2.d(true);
                    return;
                }
                return;
        }
    }

    @Override
    public void l(int i7) {
        mo0 mo0Var = this.f34421b;
        dh.g gVar = mo0Var.J2;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (c8.zc.a(i7, 4)) {
                gVar.h(mo0Var.X0.e());
            }
            gVar.e(mo0Var.O2, mo0Var.f28672b.getWidth(), mo0Var.f28672b.getHeight());
        }
    }
}
