package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class jq0 implements org.telegram.ui.Components.d5, org.telegram.ui.Components.ol0, org.telegram.ui.ActionBar.l1, org.telegram.ui.ActionBar.a2 {
    public final int f37739a;
    public final wq0 f37740b;

    public jq0(wq0 wq0Var, int i10) {
        this.f37739a = i10;
        this.f37740b = wq0Var;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        switch (this.f37739a) {
            case 0:
                this.f37740b.e0(i10, z10);
                return;
            default:
                this.f37740b.e0(i10, z10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        wq0 wq0Var = this.f37740b;
        if (wq0Var.Y) {
            wq0Var.Z(view, wq0Var.J.photos.get(i10));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.t5) {
            org.telegram.ui.Components.dm0 dm0Var = wq0Var.V;
            boolean z10 = !((org.telegram.ui.Cells.t5) view).a();
            wq0Var.X = z10;
            dm0Var.d(view, i10, z10);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        wq0 wq0Var = this.f37740b;
        ar0 ar0Var = wq0Var.f42619t0;
        if (ar0Var != null) {
            switch (ar0Var.f34894a) {
                case 0:
                    br0 br0Var = ar0Var.f34895b;
                    br0Var.f35176a.Y();
                    br0Var.f35177b.Y();
                    return;
                default:
                    br0 br0Var2 = ar0Var.f34895b;
                    br0Var2.f35176a.Y();
                    br0Var2.f35177b.Y();
                    return;
            }
        }
        wq0Var.Y();
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        wq0 wq0Var = this.f37740b;
        wq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = wq0Var.m0) != null && n1Var.isShowing()) {
            wq0Var.m0.d(true);
        }
    }
}
