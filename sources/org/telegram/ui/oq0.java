package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class oq0 implements org.telegram.ui.Components.c5, org.telegram.ui.Components.ll0, org.telegram.ui.ActionBar.n1, org.telegram.ui.ActionBar.c2 {
    public final int f35585a;
    public final br0 f35586b;

    public oq0(br0 br0Var, int i10) {
        this.f35585a = i10;
        this.f35586b = br0Var;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        switch (this.f35585a) {
            case 0:
                this.f35586b.e0(i10, z10);
                return;
            default:
                this.f35586b.e0(i10, z10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        br0 br0Var = this.f35586b;
        if (br0Var.Y) {
            br0Var.a0(view, br0Var.J.photos.get(i10));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.t5) {
            org.telegram.ui.Components.xl0 xl0Var = br0Var.V;
            boolean z10 = !((org.telegram.ui.Cells.t5) view).a();
            br0Var.X = z10;
            xl0Var.d(view, i10, z10);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        br0 br0Var = this.f35586b;
        fr0 fr0Var = br0Var.f31388t0;
        if (fr0Var != null) {
            switch (fr0Var.f32901a) {
                case 0:
                    gr0 gr0Var = fr0Var.f32902b;
                    gr0Var.f33166a.Z();
                    gr0Var.f33167b.Z();
                    return;
                default:
                    gr0 gr0Var2 = fr0Var.f32902b;
                    gr0Var2.f33166a.Z();
                    gr0Var2.f33167b.Z();
                    return;
            }
        }
        br0Var.Z();
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        br0 br0Var = this.f35586b;
        br0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = br0Var.m0) != null && p1Var.isShowing()) {
            br0Var.m0.d(true);
        }
    }
}
