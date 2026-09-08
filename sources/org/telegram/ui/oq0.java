package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class oq0 implements org.telegram.ui.Components.d5, org.telegram.ui.Components.bl0, org.telegram.ui.ActionBar.l1, org.telegram.ui.ActionBar.a2 {
    public final int f39327a;
    public final br0 f39328b;

    public oq0(br0 br0Var, int i10) {
        this.f39327a = i10;
        this.f39328b = br0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f39327a) {
            case 0:
                this.f39328b.e0(i10, z10);
                return;
            default:
                this.f39328b.e0(i10, z10);
                return;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        br0 br0Var = this.f39328b;
        if (br0Var.Y) {
            br0Var.a0(view, br0Var.J.photos.get(i10));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.s5) {
            org.telegram.ui.Components.nl0 nl0Var = br0Var.V;
            boolean z10 = !((org.telegram.ui.Cells.s5) view).a();
            br0Var.X = z10;
            nl0Var.d(view, i10, z10);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        br0 br0Var = this.f39328b;
        fr0 fr0Var = br0Var.f34934t0;
        if (fr0Var != null) {
            switch (fr0Var.f36480a) {
                case 0:
                    gr0 gr0Var = fr0Var.f36481b;
                    gr0Var.f36779a.Z();
                    gr0Var.f36780b.Z();
                    return;
                default:
                    gr0 gr0Var2 = fr0Var.f36481b;
                    gr0Var2.f36779a.Z();
                    gr0Var2.f36780b.Z();
                    return;
            }
        }
        br0Var.Z();
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        br0 br0Var = this.f39328b;
        br0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = br0Var.m0) != null && n1Var.isShowing()) {
            br0Var.m0.d(true);
        }
    }
}
