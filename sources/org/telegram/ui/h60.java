package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class h60 implements org.telegram.ui.Components.n20, org.telegram.ui.ActionBar.b2, r0.n {
    public final int f39797a;
    public final t60 f39798b;

    public h60(t60 t60Var, int i10) {
        this.f39797a = i10;
        this.f39798b = t60Var;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(k1Var, false).d;
        t60 t60Var = this.f39798b;
        t60Var.m0 = i10;
        bi.t1 t1Var = t60Var.F;
        if (t1Var != null) {
            t1Var.setPadding(0, 0, 0, i10);
        }
        t60Var.k0();
        t60Var.i0();
        return r0.k1.f47152b;
    }

    @Override
    public void a(int i10) {
        t60 t60Var = this.f39798b;
        t60Var.f43499b.a(Math.min(i10, t60Var.f43502c0));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f39797a) {
            case 1:
                this.f39798b.p0();
                return;
            default:
                this.f39798b.finishFragment();
                return;
        }
    }
}
