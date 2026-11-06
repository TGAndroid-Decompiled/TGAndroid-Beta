package org.telegram.ui.Components;

import android.content.Context;
public final class yl0 extends jg.h0 {
    public final org.telegram.ui.ww I0;
    public final Context J0;
    public final org.telegram.ui.fw K0;

    public yl0(org.telegram.ui.fw fwVar, Context context, org.telegram.ui.ww wwVar, int i7, int i10, v4.k kVar, boolean z9, org.telegram.ui.ww wwVar2, Context context2) {
        super(context, wwVar, i7, i10, kVar, z9);
        this.K0 = fwVar;
        this.I0 = wwVar2;
        this.J0 = context2;
    }

    @Override
    public final void f() {
        bi.q1 q1Var;
        int i7 = this.B0;
        super.f();
        org.telegram.ui.fw fwVar = this.K0;
        if (!fwVar.K0 && (q1Var = fwVar.f33578a0) != null) {
            q1Var.v0(0);
            fwVar.K0 = true;
        }
        if (b() != 0 || i7 == 0 || this.D0 > 0) {
            return;
        }
        fwVar.f33579b0.e(false, false);
    }
}
