package org.telegram.ui.Components;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class wn0 implements ri.m, r0.m, org.telegram.ui.ActionBar.e1, ri.n {
    public final int f41866a;
    public final ap0 f41867b;

    public wn0(ap0 ap0Var, int i7) {
        this.f41866a = i7;
        this.f41867b = ap0Var;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        ap0 ap0Var = this.f41867b;
        ap0Var.t0(g10);
        i0.b f10 = l1Var.f56299a.f(519);
        if (!ap0Var.C2.equals(f10)) {
            ap0Var.C2 = f10;
            ap0Var.f30176c.requestLayout();
        }
        return r0.l1.f56298b;
    }

    @Override
    public int e() {
        ap0 ap0Var = this.f41867b;
        ap0Var.getClass();
        return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29378d6, ap0Var.J0);
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        switch (this.f41866a) {
            case 2:
                ap0 ap0Var = this.f41867b;
                ap0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = ap0Var.F2) != null && g1Var.isShowing()) {
                    ap0Var.F2.d(true);
                    return;
                }
                return;
            default:
                ap0 ap0Var2 = this.f41867b;
                ap0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var2 = ap0Var2.F2) != null && g1Var2.isShowing()) {
                    ap0Var2.F2.d(true);
                    return;
                }
                return;
        }
    }

    @Override
    public void l(int i7) {
        ap0 ap0Var = this.f41867b;
        dh.g gVar = ap0Var.K2;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (c8.dd.a(i7, 4)) {
                gVar.h(ap0Var.Y0.e());
            }
            gVar.e(ap0Var.P2, ap0Var.f30173b.getWidth(), ap0Var.f30173b.getHeight());
        }
    }
}
