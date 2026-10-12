package org.telegram.ui.Components;

import android.content.Context;
public final class cp0 extends gg.h0 {
    public final org.telegram.ui.vy I0;
    public final Context J0;
    public final org.telegram.ui.fy K0;

    public cp0(org.telegram.ui.fy fyVar, Context context, org.telegram.ui.vy vyVar, int i10, int i11, s4.j jVar, boolean z10, org.telegram.ui.vy vyVar2, Context context2) {
        super(context, vyVar, i10, i11, jVar, z10);
        this.K0 = fyVar;
        this.I0 = vyVar2;
        this.J0 = context2;
    }

    @Override
    public final void l() {
        ai.w0 w0Var;
        int i10 = this.B0;
        super.l();
        org.telegram.ui.fy fyVar = this.K0;
        if (!fyVar.I0 && (w0Var = fyVar.V) != null) {
            w0Var.u0(0);
            fyVar.I0 = true;
        }
        if (h() != 0 || i10 == 0 || this.D0 > 0) {
            return;
        }
        fyVar.W.e(false, false);
    }
}
