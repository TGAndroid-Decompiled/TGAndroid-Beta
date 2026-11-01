package org.telegram.ui.Components;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class jo0 implements ei.n, r0.m, org.telegram.ui.ActionBar.i1, ei.o {
    public final int f27534a;
    public final pp0 f27535b;

    public jo0(pp0 pp0Var, int i10) {
        this.f27534a = i10;
        this.f27535b = pp0Var;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        WindowInsets g10 = j1Var.g();
        pp0 pp0Var = this.f27535b;
        pp0Var.t0(g10);
        i0.c f7 = j1Var.f46143a.f(519);
        if (!pp0Var.f29507y2.equals(f7)) {
            pp0Var.f29507y2 = f7;
            pp0Var.f21590c.requestLayout();
        }
        return r0.j1.f46142b;
    }

    @Override
    public int c() {
        pp0 pp0Var = this.f27535b;
        pp0Var.getClass();
        return org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, pp0Var.I0);
    }

    @Override
    public void j(int i10) {
        pp0 pp0Var = this.f27535b;
        tg.f fVar = pp0Var.G2;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            if (v7.u7.a(i10, 4)) {
                fVar.h(pp0Var.X0.e());
            }
            fVar.e(pp0Var.L2, pp0Var.f21587b.getWidth(), pp0Var.f21587b.getHeight());
        }
    }

    @Override
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.k1 k1Var;
        org.telegram.ui.ActionBar.k1 k1Var2;
        switch (this.f27534a) {
            case 2:
                pp0 pp0Var = this.f27535b;
                pp0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k1Var = pp0Var.B2) != null && k1Var.isShowing()) {
                    pp0Var.B2.d(true);
                    return;
                }
                return;
            default:
                pp0 pp0Var2 = this.f27535b;
                pp0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k1Var2 = pp0Var2.B2) != null && k1Var2.isShowing()) {
                    pp0Var2.B2.d(true);
                    return;
                }
                return;
        }
    }
}
