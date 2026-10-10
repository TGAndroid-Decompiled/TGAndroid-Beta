package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class oq0 implements org.telegram.ui.Components.f5, org.telegram.ui.Components.hm0, org.telegram.ui.ActionBar.l1, org.telegram.ui.ActionBar.a2 {
    public final int f40634a;
    public final br0 f40635b;

    public oq0(br0 br0Var, int i10) {
        this.f40634a = i10;
        this.f40635b = br0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f40634a) {
            case 0:
                this.f40635b.e0(i10, z10);
                return;
            default:
                this.f40635b.e0(i10, z10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        br0 br0Var = this.f40635b;
        if (br0Var.Y) {
            br0Var.a0(view, br0Var.J.photos.get(i10));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.t5) {
            org.telegram.ui.Components.tm0 tm0Var = br0Var.V;
            boolean z10 = !((org.telegram.ui.Cells.t5) view).a();
            br0Var.X = z10;
            tm0Var.d(view, i10, z10);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        br0 br0Var = this.f40635b;
        fr0 fr0Var = br0Var.f36459t0;
        if (fr0Var != null) {
            switch (fr0Var.f37713a) {
                case 0:
                    gr0 gr0Var = fr0Var.f37714b;
                    gr0Var.f38128a.Z();
                    gr0Var.f38129b.Z();
                    return;
                default:
                    gr0 gr0Var2 = fr0Var.f37714b;
                    gr0Var2.f38128a.Z();
                    gr0Var2.f38129b.Z();
                    return;
            }
        }
        br0Var.Z();
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        br0 br0Var = this.f40635b;
        br0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = br0Var.m0) != null && n1Var.isShowing()) {
            br0Var.m0.d(true);
        }
    }
}
