package org.telegram.ui.Components;

import android.content.Context;
public final class eo0 extends gg.i0 {
    public final org.telegram.ui.qy I0;
    public final Context J0;
    public final org.telegram.ui.zx K0;

    public eo0(org.telegram.ui.zx zxVar, Context context, org.telegram.ui.qy qyVar, int i10, int i11, s4.j jVar, boolean z10, org.telegram.ui.qy qyVar2, Context context2) {
        super(context, qyVar, i10, i11, jVar, z10);
        this.K0 = zxVar;
        this.I0 = qyVar2;
        this.J0 = context2;
    }

    @Override
    public final void l() {
        ai.w0 w0Var;
        int i10 = this.B0;
        super.l();
        org.telegram.ui.zx zxVar = this.K0;
        if (!zxVar.I0 && (w0Var = zxVar.V) != null) {
            w0Var.u0(0);
            zxVar.I0 = true;
        }
        if (h() != 0 || i10 == 0 || this.D0 > 0) {
            return;
        }
        zxVar.W.e(false, false);
    }
}
