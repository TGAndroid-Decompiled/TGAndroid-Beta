package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class co0 implements org.telegram.ui.Components.q4, org.telegram.ui.Components.ik0, org.telegram.ui.ActionBar.i1, org.telegram.ui.ActionBar.u1 {
    public final int f36494a;
    public final lo0 f36495b;

    public co0(lo0 lo0Var, int i10) {
        this.f36494a = i10;
        this.f36495b = lo0Var;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        switch (this.f36494a) {
            case 0:
                this.f36495b.i0(i10, z10);
                return;
            default:
                this.f36495b.i0(i10, z10);
                return;
        }
    }

    @Override
    public boolean f(int i10, View view) {
        lo0 lo0Var = this.f36495b;
        if (lo0Var.Y) {
            lo0Var.e0(view, lo0Var.J.e.get(i10));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.v5) {
            org.telegram.ui.Components.xk0 xk0Var = lo0Var.V;
            boolean z10 = !((org.telegram.ui.Cells.v5) view).a();
            lo0Var.X = z10;
            xk0Var.d(i10, view, z10);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        lo0 lo0Var = this.f36495b;
        mo0 mo0Var = lo0Var.f39352t0;
        if (mo0Var != null) {
            switch (mo0Var.f39741a) {
                case 1:
                    oo0 oo0Var = mo0Var.f39742b;
                    oo0Var.f40349a.d0();
                    oo0Var.f40350b.d0();
                    return;
                default:
                    oo0 oo0Var2 = mo0Var.f39742b;
                    oo0Var2.f40349a.d0();
                    oo0Var2.f40350b.d0();
                    return;
            }
        }
        lo0Var.d0();
    }

    @Override
    public void r(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.k1 k1Var;
        lo0 lo0Var = this.f36495b;
        lo0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k1Var = lo0Var.m0) != null && k1Var.isShowing()) {
            lo0Var.m0.d(true);
        }
    }
}
