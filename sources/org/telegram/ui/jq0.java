package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class jq0 implements org.telegram.ui.Components.d5, org.telegram.ui.Components.ol0, org.telegram.ui.ActionBar.m1, org.telegram.ui.ActionBar.b2 {
    public final int f34837a;
    public final wq0 f34838b;

    public jq0(wq0 wq0Var, int i10) {
        this.f34837a = i10;
        this.f34838b = wq0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f34837a) {
            case 0:
                this.f34838b.e0(i10, z10);
                return;
            default:
                this.f34838b.e0(i10, z10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        wq0 wq0Var = this.f34838b;
        if (wq0Var.Y) {
            wq0Var.a0(view, wq0Var.J.photos.get(i10));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.t5) {
            org.telegram.ui.Components.am0 am0Var = wq0Var.V;
            boolean z10 = !((org.telegram.ui.Cells.t5) view).a();
            wq0Var.X = z10;
            am0Var.d(view, i10, z10);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        wq0 wq0Var = this.f34838b;
        ar0 ar0Var = wq0Var.f39436t0;
        if (ar0Var != null) {
            switch (ar0Var.f32129a) {
                case 0:
                    br0 br0Var = ar0Var.f32130b;
                    br0Var.f32419a.Z();
                    br0Var.f32420b.Z();
                    return;
                default:
                    br0 br0Var2 = ar0Var.f32130b;
                    br0Var2.f32419a.Z();
                    br0Var2.f32420b.Z();
                    return;
            }
        }
        wq0Var.Z();
    }

    @Override
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        wq0 wq0Var = this.f34838b;
        wq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = wq0Var.m0) != null && o1Var.isShowing()) {
            wq0Var.m0.d(true);
        }
    }
}
