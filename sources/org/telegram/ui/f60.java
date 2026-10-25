package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class f60 implements org.telegram.ui.Components.n20, org.telegram.ui.ActionBar.b2, r0.n {
    public final int f39278a;
    public final r60 f39279b;

    public f60(r60 r60Var, int i10) {
        this.f39278a = i10;
        this.f39279b = r60Var;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(k1Var, false).d;
        r60 r60Var = this.f39279b;
        r60Var.m0 = i10;
        bi.t1 t1Var = r60Var.F;
        if (t1Var != null) {
            t1Var.setPadding(0, 0, 0, i10);
        }
        r60Var.k0();
        r60Var.i0();
        return r0.k1.f47114b;
    }

    @Override
    public void a(int i10) {
        r60 r60Var = this.f39279b;
        r60Var.f43011b.a(Math.min(i10, r60Var.f43014c0));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f39278a) {
            case 1:
                this.f39279b.p0();
                return;
            default:
                this.f39279b.finishFragment();
                return;
        }
    }
}
