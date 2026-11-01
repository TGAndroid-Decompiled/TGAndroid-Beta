package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class ao0 implements org.telegram.ui.Components.q4, org.telegram.ui.Components.jk0, org.telegram.ui.ActionBar.i1, org.telegram.ui.ActionBar.u1 {
    public final int f35818a;
    public final jo0 f35819b;

    public ao0(jo0 jo0Var, int i10) {
        this.f35818a = i10;
        this.f35819b = jo0Var;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        switch (this.f35818a) {
            case 0:
                this.f35819b.j0(i10, z10);
                return;
            default:
                this.f35819b.j0(i10, z10);
                return;
        }
    }

    @Override
    public boolean f(int i10, View view) {
        jo0 jo0Var = this.f35819b;
        if (jo0Var.Y) {
            jo0Var.f0(view, jo0Var.J.e.get(i10));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.v5) {
            org.telegram.ui.Components.yk0 yk0Var = jo0Var.V;
            boolean z10 = !((org.telegram.ui.Cells.v5) view).a();
            jo0Var.X = z10;
            yk0Var.d(i10, view, z10);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        jo0 jo0Var = this.f35819b;
        ko0 ko0Var = jo0Var.f38507t0;
        if (ko0Var != null) {
            switch (ko0Var.f38949a) {
                case 1:
                    mo0 mo0Var = ko0Var.f38950b;
                    mo0Var.f39585a.e0();
                    mo0Var.f39586b.e0();
                    return;
                default:
                    mo0 mo0Var2 = ko0Var.f38950b;
                    mo0Var2.f39585a.e0();
                    mo0Var2.f39586b.e0();
                    return;
            }
        }
        jo0Var.e0();
    }

    @Override
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.k1 k1Var;
        jo0 jo0Var = this.f35819b;
        jo0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k1Var = jo0Var.m0) != null && k1Var.isShowing()) {
            jo0Var.m0.d(true);
        }
    }
}
