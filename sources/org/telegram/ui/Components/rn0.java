package org.telegram.ui.Components;

import android.content.Context;
public final class rn0 extends gg.i0 {
    public final org.telegram.ui.ry I0;
    public final Context J0;
    public final org.telegram.ui.ay K0;

    public rn0(org.telegram.ui.ay ayVar, Context context, org.telegram.ui.ry ryVar, int i10, int i11, s4.j jVar, boolean z10, org.telegram.ui.ry ryVar2, Context context2) {
        super(context, ryVar, i10, i11, jVar, z10);
        this.K0 = ayVar;
        this.I0 = ryVar2;
        this.J0 = context2;
    }

    @Override
    public final void l() {
        ai.w0 w0Var;
        int i10 = this.B0;
        super.l();
        org.telegram.ui.ay ayVar = this.K0;
        if (!ayVar.I0 && (w0Var = ayVar.V) != null) {
            w0Var.u0(0);
            ayVar.I0 = true;
        }
        if (h() != 0 || i10 == 0 || this.D0 > 0) {
            return;
        }
        ayVar.W.e(false, false);
    }
}
