package org.telegram.ui.Components;

import android.content.Context;

public final class cn0 extends pf.z {
    public final org.telegram.ui.gy E0;
    public final Context F0;
    public final org.telegram.ui.px G0;

    public cn0(org.telegram.ui.px pxVar, Context context, org.telegram.ui.gy gyVar, int i10, int i11, f2.l lVar, boolean z10, org.telegram.ui.gy gyVar2, Context context2) {
        super(context, gyVar, i10, i11, lVar, z10);
        this.G0 = pxVar;
        this.E0 = gyVar2;
        this.F0 = context2;
    }

    @Override
    public final void l() {
        hh.f1 f1Var;
        int i10 = this.f46009x0;
        super.l();
        org.telegram.ui.px pxVar = this.G0;
        if (!pxVar.E0 && (f1Var = pxVar.R) != null) {
            f1Var.u0(0);
            pxVar.E0 = true;
        }
        if (h() != 0 || i10 == 0 || this.f46012z0 > 0) {
            return;
        }
        pxVar.S.e(false, false);
    }
}
