package org.telegram.ui.Components;

import android.content.Context;
public final class xo0 extends ig.i0 {
    public final org.telegram.ui.ey I0;
    public final Context J0;
    public final org.telegram.ui.mx K0;

    public xo0(org.telegram.ui.mx mxVar, Context context, org.telegram.ui.ey eyVar, int i10, int i11, s4.l lVar, boolean z10, org.telegram.ui.ey eyVar2, Context context2) {
        super(context, eyVar, i10, i11, lVar, z10);
        this.K0 = mxVar;
        this.I0 = eyVar2;
        this.J0 = context2;
    }

    @Override
    public final void l() {
        bi.r1 r1Var;
        int i10 = this.B0;
        super.l();
        org.telegram.ui.mx mxVar = this.K0;
        if (!mxVar.K0 && (r1Var = mxVar.f28241a0) != null) {
            r1Var.v0(0);
            mxVar.K0 = true;
        }
        if (h() != 0 || i10 == 0 || this.D0 > 0) {
            return;
        }
        mxVar.f28242b0.e(false, false);
    }
}
