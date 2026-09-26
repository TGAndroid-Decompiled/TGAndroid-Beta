package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class gq0 implements org.telegram.ui.Components.d5, org.telegram.ui.Components.nl0, org.telegram.ui.ActionBar.k1, org.telegram.ui.ActionBar.z1 {
    public final int f34036a;
    public final tq0 f34037b;

    public gq0(tq0 tq0Var, int i10) {
        this.f34036a = i10;
        this.f34037b = tq0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f34036a) {
            case 0:
                this.f34037b.e0(i10, z10);
                return;
            default:
                this.f34037b.e0(i10, z10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        tq0 tq0Var = this.f34037b;
        if (tq0Var.Y) {
            tq0Var.a0(view, tq0Var.J.photos.get(i10));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.t5) {
            org.telegram.ui.Components.zl0 zl0Var = tq0Var.V;
            boolean z10 = !((org.telegram.ui.Cells.t5) view).a();
            tq0Var.X = z10;
            zl0Var.d(view, i10, z10);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        tq0 tq0Var = this.f34037b;
        xq0 xq0Var = tq0Var.f38212t0;
        if (xq0Var != null) {
            switch (xq0Var.f39964a) {
                case 0:
                    yq0 yq0Var = xq0Var.f39965b;
                    yq0Var.f40224a.Z();
                    yq0Var.f40225b.Z();
                    return;
                default:
                    yq0 yq0Var2 = xq0Var.f39965b;
                    yq0Var2.f40224a.Z();
                    yq0Var2.f40225b.Z();
                    return;
            }
        }
        tq0Var.Z();
    }

    @Override
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        tq0 tq0Var = this.f34037b;
        tq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = tq0Var.m0) != null && m1Var.isShowing()) {
            tq0Var.m0.d(true);
        }
    }
}
