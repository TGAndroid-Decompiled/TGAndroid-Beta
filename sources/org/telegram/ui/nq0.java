package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class nq0 implements org.telegram.ui.Components.b5, org.telegram.ui.Components.bl0, org.telegram.ui.ActionBar.l1, org.telegram.ui.ActionBar.a2 {
    public final int f36028a;
    public final ar0 f36029b;

    public nq0(ar0 ar0Var, int i10) {
        this.f36028a = i10;
        this.f36029b = ar0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f36028a) {
            case 0:
                this.f36029b.e0(i10, z10);
                return;
            default:
                this.f36029b.e0(i10, z10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        ar0 ar0Var = this.f36029b;
        if (ar0Var.Y) {
            ar0Var.a0(view, ar0Var.J.photos.get(i10));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.s5) {
            org.telegram.ui.Components.nl0 nl0Var = ar0Var.V;
            boolean z10 = !((org.telegram.ui.Cells.s5) view).a();
            ar0Var.X = z10;
            nl0Var.d(view, i10, z10);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ar0 ar0Var = this.f36029b;
        fr0 fr0Var = ar0Var.f31933t0;
        if (fr0Var != null) {
            switch (fr0Var.f33648a) {
                case 0:
                    gr0 gr0Var = fr0Var.f33649b;
                    gr0Var.f33990a.Z();
                    gr0Var.f33991b.Z();
                    return;
                default:
                    gr0 gr0Var2 = fr0Var.f33649b;
                    gr0Var2.f33990a.Z();
                    gr0Var2.f33991b.Z();
                    return;
            }
        }
        ar0Var.Z();
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        ar0 ar0Var = this.f36029b;
        ar0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = ar0Var.m0) != null && n1Var.isShowing()) {
            ar0Var.m0.d(true);
        }
    }
}
