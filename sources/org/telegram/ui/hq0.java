package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class hq0 implements org.telegram.ui.Components.d5, org.telegram.ui.Components.cl0, org.telegram.ui.ActionBar.l1, org.telegram.ui.ActionBar.a2 {
    public final int f33903a;
    public final uq0 f33904b;

    public hq0(uq0 uq0Var, int i10) {
        this.f33903a = i10;
        this.f33904b = uq0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f33903a) {
            case 0:
                this.f33904b.e0(i10, z10);
                return;
            default:
                this.f33904b.e0(i10, z10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        uq0 uq0Var = this.f33904b;
        if (uq0Var.Y) {
            uq0Var.a0(view, uq0Var.J.photos.get(i10));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.t5) {
            org.telegram.ui.Components.ol0 ol0Var = uq0Var.V;
            boolean z10 = !((org.telegram.ui.Cells.t5) view).a();
            uq0Var.X = z10;
            ol0Var.d(view, i10, z10);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        uq0 uq0Var = this.f33904b;
        zq0 zq0Var = uq0Var.f38192t0;
        if (zq0Var != null) {
            switch (zq0Var.f40225a) {
                case 0:
                    ar0 ar0Var = zq0Var.f40226b;
                    ar0Var.f31867a.Z();
                    ar0Var.f31868b.Z();
                    return;
                default:
                    ar0 ar0Var2 = zq0Var.f40226b;
                    ar0Var2.f31867a.Z();
                    ar0Var2.f31868b.Z();
                    return;
            }
        }
        uq0Var.Z();
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        uq0 uq0Var = this.f33904b;
        uq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = uq0Var.m0) != null && n1Var.isShowing()) {
            uq0Var.m0.d(true);
        }
    }
}
