package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class nq0 implements org.telegram.ui.Components.f5, org.telegram.ui.Components.im0, org.telegram.ui.ActionBar.k1, org.telegram.ui.ActionBar.z1 {
    public final int f40345a;
    public final ar0 f40346b;

    public nq0(ar0 ar0Var, int i10) {
        this.f40345a = i10;
        this.f40346b = ar0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f40345a) {
            case 0:
                this.f40346b.e0(i10, z10);
                return;
            default:
                this.f40346b.e0(i10, z10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        ar0 ar0Var = this.f40346b;
        if (ar0Var.Y) {
            ar0Var.a0(view, ar0Var.J.photos.get(i10));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.t5) {
            org.telegram.ui.Components.um0 um0Var = ar0Var.V;
            boolean z10 = !((org.telegram.ui.Cells.t5) view).a();
            ar0Var.X = z10;
            um0Var.d(view, i10, z10);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ar0 ar0Var = this.f40346b;
        er0 er0Var = ar0Var.f36159t0;
        if (er0Var != null) {
            switch (er0Var.f37430a) {
                case 0:
                    fr0 fr0Var = er0Var.f37431b;
                    fr0Var.f37746a.Z();
                    fr0Var.f37747b.Z();
                    return;
                default:
                    fr0 fr0Var2 = er0Var.f37431b;
                    fr0Var2.f37746a.Z();
                    fr0Var2.f37747b.Z();
                    return;
            }
        }
        ar0Var.Z();
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        ar0 ar0Var = this.f40346b;
        ar0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = ar0Var.m0) != null && m1Var.isShowing()) {
            ar0Var.m0.d(true);
        }
    }
}
