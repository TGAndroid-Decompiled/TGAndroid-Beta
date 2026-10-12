package org.telegram.ui.Components;

import android.content.Context;
public final class so0 extends hg.h0 {
    public final org.telegram.ui.yy I0;
    public final Context J0;
    public final org.telegram.ui.iy K0;

    public so0(org.telegram.ui.iy iyVar, Context context, org.telegram.ui.yy yyVar, int i10, int i11, s4.k kVar, boolean z10, org.telegram.ui.yy yyVar2, Context context2) {
        super(context, yyVar, i10, i11, kVar, z10);
        this.K0 = iyVar;
        this.I0 = yyVar2;
        this.J0 = context2;
    }

    @Override
    public final void l() {
        bi.o0 o0Var;
        int i10 = this.B0;
        super.l();
        org.telegram.ui.iy iyVar = this.K0;
        if (!iyVar.I0 && (o0Var = iyVar.V) != null) {
            o0Var.u0(0);
            iyVar.I0 = true;
        }
        if (h() != 0 || i10 == 0 || this.D0 > 0) {
            return;
        }
        iyVar.W.e(false, false);
    }
}
