package org.telegram.ui.Components;

import android.content.Context;
public final class wo0 extends ig.i0 {
    public final org.telegram.ui.cy I0;
    public final Context J0;
    public final org.telegram.ui.jx K0;

    public wo0(org.telegram.ui.jx jxVar, Context context, org.telegram.ui.cy cyVar, int i10, int i11, s4.l lVar, boolean z10, org.telegram.ui.cy cyVar2, Context context2) {
        super(context, cyVar, i10, i11, lVar, z10);
        this.K0 = jxVar;
        this.I0 = cyVar2;
        this.J0 = context2;
    }

    @Override
    public final void l() {
        bi.r1 r1Var;
        int i10 = this.B0;
        super.l();
        org.telegram.ui.jx jxVar = this.K0;
        if (!jxVar.K0 && (r1Var = jxVar.f27933a0) != null) {
            r1Var.v0(0);
            jxVar.K0 = true;
        }
        if (h() != 0 || i10 == 0 || this.D0 > 0) {
            return;
        }
        jxVar.f27934b0.e(false, false);
    }
}
