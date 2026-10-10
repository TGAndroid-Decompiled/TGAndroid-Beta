package org.telegram.ui.Components;

import android.content.Context;
public final class xo0 extends gg.h0 {
    public final org.telegram.ui.ty I0;
    public final Context J0;
    public final org.telegram.ui.dy K0;

    public xo0(org.telegram.ui.dy dyVar, Context context, org.telegram.ui.ty tyVar, int i10, int i11, s4.j jVar, boolean z10, org.telegram.ui.ty tyVar2, Context context2) {
        super(context, tyVar, i10, i11, jVar, z10);
        this.K0 = dyVar;
        this.I0 = tyVar2;
        this.J0 = context2;
    }

    @Override
    public final void l() {
        ai.w0 w0Var;
        int i10 = this.B0;
        super.l();
        org.telegram.ui.dy dyVar = this.K0;
        if (!dyVar.I0 && (w0Var = dyVar.V) != null) {
            w0Var.u0(0);
            dyVar.I0 = true;
        }
        if (h() != 0 || i10 == 0 || this.D0 > 0) {
            return;
        }
        dyVar.W.e(false, false);
    }
}
