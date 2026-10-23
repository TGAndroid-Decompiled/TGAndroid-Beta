package org.telegram.ui.Components;

import android.content.Context;
public final class so0 extends hg.h0 {
    public final org.telegram.ui.ey I0;
    public final Context J0;
    public final org.telegram.ui.nx K0;

    public so0(org.telegram.ui.nx nxVar, Context context, org.telegram.ui.ey eyVar, int i10, int i11, s4.k kVar, boolean z10, org.telegram.ui.ey eyVar2, Context context2) {
        super(context, eyVar, i10, i11, kVar, z10);
        this.K0 = nxVar;
        this.I0 = eyVar2;
        this.J0 = context2;
    }

    @Override
    public final void l() {
        ai.u1 u1Var;
        int i10 = this.B0;
        super.l();
        org.telegram.ui.nx nxVar = this.K0;
        if (!nxVar.I0 && (u1Var = nxVar.V) != null) {
            u1Var.u0(0);
            nxVar.I0 = true;
        }
        if (h() != 0 || i10 == 0 || this.D0 > 0) {
            return;
        }
        nxVar.W.e(false, false);
    }
}
