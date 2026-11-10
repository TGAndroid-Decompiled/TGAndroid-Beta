package org.telegram.ui.Components;

import android.content.Context;
public final class yl0 extends jg.h0 {
    public final org.telegram.ui.zw I0;
    public final Context J0;
    public final org.telegram.ui.iw K0;

    public yl0(org.telegram.ui.iw iwVar, Context context, org.telegram.ui.zw zwVar, int i7, int i10, v4.k kVar, boolean z9, org.telegram.ui.zw zwVar2, Context context2) {
        super(context, zwVar, i7, i10, kVar, z9);
        this.K0 = iwVar;
        this.I0 = zwVar2;
        this.J0 = context2;
    }

    @Override
    public final void f() {
        bi.q1 q1Var;
        int i7 = this.B0;
        super.f();
        org.telegram.ui.iw iwVar = this.K0;
        if (!iwVar.K0 && (q1Var = iwVar.f33587a0) != null) {
            q1Var.v0(0);
            iwVar.K0 = true;
        }
        if (b() != 0 || i7 == 0 || this.D0 > 0) {
            return;
        }
        iwVar.f33588b0.e(false, false);
    }
}
