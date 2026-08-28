package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class mp0 implements org.telegram.ui.Components.x4, org.telegram.ui.Components.ok0, org.telegram.ui.ActionBar.m1, org.telegram.ui.ActionBar.b2 {
    public final int f40500a;
    public final zp0 f40501b;

    public mp0(zp0 zp0Var, int i9) {
        this.f40500a = i9;
        this.f40501b = zp0Var;
    }

    @Override
    public void B(int i9, int i10, boolean z10) {
        switch (this.f40500a) {
            case 0:
                this.f40501b.d0(i9, z10);
                return;
            default:
                this.f40501b.d0(i9, z10);
                return;
        }
    }

    @Override
    public boolean a(int i9, View view) {
        zp0 zp0Var = this.f40501b;
        if (zp0Var.U) {
            zp0Var.Z(view, zp0Var.F.photos.get(i9));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.t5) {
            org.telegram.ui.Components.yk0 yk0Var = zp0Var.R;
            boolean z10 = !((org.telegram.ui.Cells.t5) view).a();
            zp0Var.T = z10;
            yk0Var.d(view, i9, z10);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        zp0 zp0Var = this.f40501b;
        dq0 dq0Var = zp0Var.f45226p0;
        if (dq0Var != null) {
            switch (dq0Var.f37583a) {
                case 0:
                    eq0 eq0Var = dq0Var.f37584b;
                    eq0Var.f38008a.Y();
                    eq0Var.f38009b.Y();
                    return;
                default:
                    eq0 eq0Var2 = dq0Var.f37584b;
                    eq0Var2.f38008a.Y();
                    eq0Var2.f38009b.Y();
                    return;
            }
        }
        zp0Var.Y();
    }

    @Override
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        zp0 zp0Var = this.f40501b;
        zp0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = zp0Var.f45219i0) != null && o1Var.isShowing()) {
            zp0Var.f45219i0.d(true);
        }
    }
}
