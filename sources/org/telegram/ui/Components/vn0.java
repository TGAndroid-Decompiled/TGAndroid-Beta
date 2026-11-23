package org.telegram.ui.Components;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class vn0 implements ri.m, r0.m, org.telegram.ui.ActionBar.e1, ri.n {
    public final int f40753a;
    public final zo0 f40754b;

    public vn0(zo0 zo0Var, int i7) {
        this.f40753a = i7;
        this.f40754b = zo0Var;
    }

    @Override
    public int j() {
        zo0 zo0Var = this.f40754b;
        zo0Var.getClass();
        return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29451d6, zo0Var.J0);
    }

    @Override
    public void k(int i7) {
        zo0 zo0Var = this.f40754b;
        dh.g gVar = zo0Var.K2;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (c8.ed.a(i7, 4)) {
                gVar.h(zo0Var.Y0.e());
            }
            gVar.e(zo0Var.P2, zo0Var.f30226b.getWidth(), zo0Var.f30226b.getHeight());
        }
    }

    @Override
    public r0.l1 l1(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        zo0 zo0Var = this.f40754b;
        zo0Var.t0(g10);
        i0.b f10 = l1Var.f56381a.f(519);
        if (!zo0Var.C2.equals(f10)) {
            zo0Var.C2 = f10;
            zo0Var.f30229c.requestLayout();
        }
        return r0.l1.f56380b;
    }

    @Override
    public void m(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        switch (this.f40753a) {
            case 2:
                zo0 zo0Var = this.f40754b;
                zo0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = zo0Var.F2) != null && g1Var.isShowing()) {
                    zo0Var.F2.d(true);
                    return;
                }
                return;
            default:
                zo0 zo0Var2 = this.f40754b;
                zo0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var2 = zo0Var2.F2) != null && g1Var2.isShowing()) {
                    zo0Var2.F2.d(true);
                    return;
                }
                return;
        }
    }
}
