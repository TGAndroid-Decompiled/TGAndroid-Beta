package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class oq0 implements org.telegram.ui.Components.f5, org.telegram.ui.Components.gm0, org.telegram.ui.ActionBar.l1, org.telegram.ui.ActionBar.a2 {
    public final int f40588a;
    public final br0 f40589b;

    public oq0(br0 br0Var, int i10) {
        this.f40588a = i10;
        this.f40589b = br0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f40588a) {
            case 0:
                this.f40589b.e0(i10, z10);
                return;
            default:
                this.f40589b.e0(i10, z10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        br0 br0Var = this.f40589b;
        if (br0Var.Y) {
            br0Var.a0(view, br0Var.J.photos.get(i10));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.t5) {
            org.telegram.ui.Components.sm0 sm0Var = br0Var.V;
            boolean z10 = !((org.telegram.ui.Cells.t5) view).a();
            br0Var.X = z10;
            sm0Var.d(view, i10, z10);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        br0 br0Var = this.f40589b;
        fr0 fr0Var = br0Var.f36413t0;
        if (fr0Var != null) {
            switch (fr0Var.f37667a) {
                case 0:
                    gr0 gr0Var = fr0Var.f37668b;
                    gr0Var.f38082a.Z();
                    gr0Var.f38083b.Z();
                    return;
                default:
                    gr0 gr0Var2 = fr0Var.f37668b;
                    gr0Var2.f38082a.Z();
                    gr0Var2.f38083b.Z();
                    return;
            }
        }
        br0Var.Z();
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        br0 br0Var = this.f40589b;
        br0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = br0Var.m0) != null && n1Var.isShowing()) {
            br0Var.m0.d(true);
        }
    }
}
