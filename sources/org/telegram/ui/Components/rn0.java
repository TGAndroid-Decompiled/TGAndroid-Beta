package org.telegram.ui.Components;

import android.content.Context;
public final class rn0 extends hg.i0 {
    public final org.telegram.ui.uy I0;
    public final Context J0;
    public final org.telegram.ui.ey K0;

    public rn0(org.telegram.ui.ey eyVar, Context context, org.telegram.ui.uy uyVar, int i10, int i11, s4.j jVar, boolean z10, org.telegram.ui.uy uyVar2, Context context2) {
        super(context, uyVar, i10, i11, jVar, z10);
        this.K0 = eyVar;
        this.I0 = uyVar2;
        this.J0 = context2;
    }

    @Override
    public final void l() {
        bi.o0 o0Var;
        int i10 = this.B0;
        super.l();
        org.telegram.ui.ey eyVar = this.K0;
        if (!eyVar.I0 && (o0Var = eyVar.V) != null) {
            o0Var.u0(0);
            eyVar.I0 = true;
        }
        if (h() != 0 || i10 == 0 || this.D0 > 0) {
            return;
        }
        eyVar.W.e(false, false);
    }
}
