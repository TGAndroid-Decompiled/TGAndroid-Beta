package org.telegram.ui.Components;

import android.content.Context;
public final class nm0 extends jg.h0 {
    public final org.telegram.ui.cx J0;
    public final Context K0;
    public final org.telegram.ui.kw L0;

    public nm0(org.telegram.ui.kw kwVar, Context context, org.telegram.ui.cx cxVar, int i7, int i10, v4.k kVar, boolean z10, org.telegram.ui.cx cxVar2, Context context2) {
        super(context, cxVar, i7, i10, kVar, z10);
        this.L0 = kwVar;
        this.J0 = cxVar2;
        this.K0 = context2;
    }

    @Override
    public final void f() {
        di.b1 b1Var;
        int i7 = this.C0;
        super.f();
        org.telegram.ui.kw kwVar = this.L0;
        if (!kwVar.L0 && (b1Var = kwVar.f40500b0) != null) {
            b1Var.v0(0);
            kwVar.L0 = true;
        }
        if (b() != 0 || i7 == 0 || this.E0 > 0) {
            return;
        }
        kwVar.f40501c0.e(false, false);
    }
}
