package org.telegram.ui.Components;

import android.content.Context;
public final class oo0 extends hg.h0 {
    public final org.telegram.ui.cy I0;
    public final Context J0;
    public final org.telegram.ui.lx K0;

    public oo0(org.telegram.ui.lx lxVar, Context context, org.telegram.ui.cy cyVar, int i10, int i11, s4.k kVar, boolean z10, org.telegram.ui.cy cyVar2, Context context2) {
        super(context, cyVar, i10, i11, kVar, z10);
        this.K0 = lxVar;
        this.I0 = cyVar2;
        this.J0 = context2;
    }

    @Override
    public final void l() {
        ai.u1 u1Var;
        int i10 = this.B0;
        super.l();
        org.telegram.ui.lx lxVar = this.K0;
        if (!lxVar.I0 && (u1Var = lxVar.V) != null) {
            u1Var.u0(0);
            lxVar.I0 = true;
        }
        if (h() != 0 || i10 == 0 || this.D0 > 0) {
            return;
        }
        lxVar.W.e(false, false);
    }
}
