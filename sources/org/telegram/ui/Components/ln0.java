package org.telegram.ui.Components;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class ln0 implements ri.m, r0.m, org.telegram.ui.ActionBar.e1, ri.n {
    public final int f36858a;
    public final po0 f36859b;

    public ln0(po0 po0Var, int i7) {
        this.f36858a = i7;
        this.f36859b = po0Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        po0 po0Var = this.f36859b;
        po0Var.t0(g10);
        i0.c f10 = k1Var.f55682a.f(519);
        if (!po0Var.C2.equals(f10)) {
            po0Var.C2 = f10;
            po0Var.f29685c.requestLayout();
        }
        return r0.k1.f55681b;
    }

    @Override
    public int e() {
        po0 po0Var = this.f36859b;
        po0Var.getClass();
        return org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, po0Var.J0);
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        switch (this.f36858a) {
            case 2:
                po0 po0Var = this.f36859b;
                po0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = po0Var.F2) != null && g1Var.isShowing()) {
                    po0Var.F2.d(true);
                    return;
                }
                return;
            default:
                po0 po0Var2 = this.f36859b;
                po0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var2 = po0Var2.F2) != null && g1Var2.isShowing()) {
                    po0Var2.F2.d(true);
                    return;
                }
                return;
        }
    }

    @Override
    public void l(int i7) {
        po0 po0Var = this.f36859b;
        dh.g gVar = po0Var.K2;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (c8.zc.a(i7, 4)) {
                gVar.h(po0Var.Y0.e());
            }
            gVar.e(po0Var.P2, po0Var.f29682b.getWidth(), po0Var.f29682b.getHeight());
        }
    }
}
