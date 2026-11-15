package org.telegram.ui;

import android.view.View;
public final class mz0 implements r0.m, org.telegram.ui.ActionBar.q1 {
    public final int f49351a;
    public final pz0 f49352b;

    public mz0(pz0 pz0Var, int i7) {
        this.f49351a = i7;
        this.f49352b = pz0Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        i0.c I0 = org.telegram.messenger.g0.I0(k1Var, false);
        pz0 pz0Var = this.f49352b;
        pz0Var.f50406e = I0;
        pz0Var.f50403c.setPadding(I0.f15574a, I0.f15575b, I0.f15576c, I0.d);
        pz0Var.f50401b.requestLayout();
        return r0.k1.f55681b;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f49351a) {
            case 1:
                org.telegram.ui.ActionBar.t1 t1Var2 = this.f49352b.f50405d0;
                if (t1Var2 != null) {
                    t1Var2.dismiss();
                    return;
                }
                return;
            default:
                pz0 pz0Var = this.f49352b;
                org.telegram.ui.ActionBar.t1 t1Var3 = pz0Var.f50405d0;
                if (t1Var3 != null) {
                    t1Var3.dismiss();
                    pz0Var.f50405d0 = null;
                }
                pz0Var.dismiss();
                return;
        }
    }
}
