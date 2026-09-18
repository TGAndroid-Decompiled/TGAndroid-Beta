package org.telegram.ui.Components;

import android.content.Context;
public final class sn0 extends gg.i0 {
    public final org.telegram.ui.wy I0;
    public final Context J0;
    public final org.telegram.ui.gy K0;

    public sn0(org.telegram.ui.gy gyVar, Context context, org.telegram.ui.wy wyVar, int i10, int i11, s4.j jVar, boolean z10, org.telegram.ui.wy wyVar2, Context context2) {
        super(context, wyVar, i10, i11, jVar, z10);
        this.K0 = gyVar;
        this.I0 = wyVar2;
        this.J0 = context2;
    }

    @Override
    public final void l() {
        ai.w0 w0Var;
        int i10 = this.B0;
        super.l();
        org.telegram.ui.gy gyVar = this.K0;
        if (!gyVar.J0 && (w0Var = gyVar.W) != null) {
            w0Var.v0(0);
            gyVar.J0 = true;
        }
        if (h() != 0 || i10 == 0 || this.D0 > 0) {
            return;
        }
        gyVar.f30549a0.e(false, false);
    }
}
