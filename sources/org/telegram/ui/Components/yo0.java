package org.telegram.ui.Components;

import android.content.Context;
public final class yo0 extends gg.h0 {
    public final org.telegram.ui.sy I0;
    public final Context J0;
    public final org.telegram.ui.cy K0;

    public yo0(org.telegram.ui.cy cyVar, Context context, org.telegram.ui.sy syVar, int i10, int i11, s4.j jVar, boolean z10, org.telegram.ui.sy syVar2, Context context2) {
        super(context, syVar, i10, i11, jVar, z10);
        this.K0 = cyVar;
        this.I0 = syVar2;
        this.J0 = context2;
    }

    @Override
    public final void l() {
        ai.w0 w0Var;
        int i10 = this.B0;
        super.l();
        org.telegram.ui.cy cyVar = this.K0;
        if (!cyVar.I0 && (w0Var = cyVar.V) != null) {
            w0Var.u0(0);
            cyVar.I0 = true;
        }
        if (h() != 0 || i10 == 0 || this.D0 > 0) {
            return;
        }
        cyVar.W.e(false, false);
    }
}
