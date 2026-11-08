package org.telegram.ui.Components;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class hn0 implements oi.m, r0.m, org.telegram.ui.ActionBar.e1, oi.n {
    public final int f34308a;
    public final mo0 f34309b;

    public hn0(mo0 mo0Var, int i7) {
        this.f34308a = i7;
        this.f34309b = mo0Var;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        mo0 mo0Var = this.f34309b;
        mo0Var.t0(g10);
        i0.b f10 = k1Var.f54201a.f(519);
        if (!mo0Var.f36074y2.equals(f10)) {
            mo0Var.f36074y2 = f10;
            mo0Var.f28622c.requestLayout();
        }
        return r0.k1.f54200b;
    }

    @Override
    public int h() {
        mo0 mo0Var = this.f34309b;
        mo0Var.getClass();
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27852d6, mo0Var.I0);
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        switch (this.f34308a) {
            case 2:
                mo0 mo0Var = this.f34309b;
                mo0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = mo0Var.B2) != null && g1Var.isShowing()) {
                    mo0Var.B2.d(true);
                    return;
                }
                return;
            default:
                mo0 mo0Var2 = this.f34309b;
                mo0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var2 = mo0Var2.B2) != null && g1Var2.isShowing()) {
                    mo0Var2.B2.d(true);
                    return;
                }
                return;
        }
    }

    @Override
    public void l(int i7) {
        mo0 mo0Var = this.f34309b;
        dh.g gVar = mo0Var.G2;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (c8.zc.a(i7, 4)) {
                gVar.h(mo0Var.X0.e());
            }
            gVar.e(mo0Var.L2, mo0Var.f28619b.getWidth(), mo0Var.f28619b.getHeight());
        }
    }
}
