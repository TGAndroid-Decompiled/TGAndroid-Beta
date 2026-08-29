package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class lp0 implements org.telegram.ui.Components.b5, org.telegram.ui.Components.bl0, org.telegram.ui.ActionBar.m1, org.telegram.ui.ActionBar.b2 {
    public final int f40253a;
    public final zp0 f40254b;

    public lp0(zp0 zp0Var, int i10) {
        this.f40253a = i10;
        this.f40254b = zp0Var;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        switch (this.f40253a) {
            case 0:
                this.f40254b.e0(i10, z10);
                return;
            default:
                this.f40254b.e0(i10, z10);
                return;
        }
    }

    @Override
    public boolean c(int i10, View view) {
        zp0 zp0Var = this.f40254b;
        if (zp0Var.U) {
            zp0Var.a0(view, zp0Var.F.photos.get(i10));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.r5) {
            org.telegram.ui.Components.ll0 ll0Var = zp0Var.R;
            boolean z10 = !((org.telegram.ui.Cells.r5) view).a();
            zp0Var.T = z10;
            ll0Var.d(view, i10, z10);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        zp0 zp0Var = this.f40254b;
        dq0 dq0Var = zp0Var.f45291p0;
        if (dq0Var != null) {
            switch (dq0Var.f37609a) {
                case 0:
                    eq0 eq0Var = dq0Var.f37610b;
                    eq0Var.f37886a.Z();
                    eq0Var.f37887b.Z();
                    return;
                default:
                    eq0 eq0Var2 = dq0Var.f37610b;
                    eq0Var2.f37886a.Z();
                    eq0Var2.f37887b.Z();
                    return;
            }
        }
        zp0Var.Z();
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        zp0 zp0Var = this.f40254b;
        zp0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = zp0Var.f45284i0) != null && o1Var.isShowing()) {
            zp0Var.f45284i0.d(true);
        }
    }
}
