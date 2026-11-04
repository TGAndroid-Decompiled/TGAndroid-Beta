package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class lm0 implements org.telegram.ui.Components.r4, org.telegram.ui.Components.hj0, org.telegram.ui.ActionBar.d1, org.telegram.ui.ActionBar.p1 {
    public final int f47362a;
    public final sm0 f47363b;

    public lm0(sm0 sm0Var, int i3) {
        this.f47362a = i3;
        this.f47363b = sm0Var;
    }

    @Override
    public void L(int i3, int i10, boolean z10) {
        switch (this.f47362a) {
            case 0:
                this.f47363b.j0(i3, z10);
                return;
            default:
                this.f47363b.j0(i3, z10);
                return;
        }
    }

    @Override
    public boolean f(int i3, View view) {
        sm0 sm0Var = this.f47363b;
        if (sm0Var.Z) {
            sm0Var.f0(view, sm0Var.K.f24738e.get(i3));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.q5) {
            org.telegram.ui.Components.xj0 xj0Var = sm0Var.W;
            boolean z10 = !((org.telegram.ui.Cells.q5) view).a();
            sm0Var.Y = z10;
            xj0Var.d(i3, view, z10);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        sm0 sm0Var = this.f47363b;
        tm0 tm0Var = sm0Var.f49565u0;
        if (tm0Var != null) {
            switch (tm0Var.f49829a) {
                case 1:
                    vm0 vm0Var = tm0Var.f49830b;
                    vm0Var.f50553a.e0();
                    vm0Var.f50554b.e0();
                    return;
                default:
                    vm0 vm0Var2 = tm0Var.f49830b;
                    vm0Var2.f50553a.e0();
                    vm0Var2.f50554b.e0();
                    return;
            }
        }
        sm0Var.e0();
    }

    @Override
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.f1 f1Var;
        sm0 sm0Var = this.f47363b;
        sm0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (f1Var = sm0Var.f49556n0) != null && f1Var.isShowing()) {
            sm0Var.f49556n0.d(true);
        }
    }
}
