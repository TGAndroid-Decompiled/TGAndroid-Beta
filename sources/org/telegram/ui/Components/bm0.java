package org.telegram.ui.Components;

import android.content.Context;
public final class bm0 extends kg.e0 {
    public final org.telegram.ui.uw J0;
    public final Context K0;
    public final org.telegram.ui.cw L0;

    public bm0(org.telegram.ui.cw cwVar, Context context, org.telegram.ui.uw uwVar, int i3, int i10, u4.k kVar, boolean z10, org.telegram.ui.uw uwVar2, Context context2) {
        super(context, uwVar, i3, i10, kVar, z10);
        this.L0 = cwVar;
        this.J0 = uwVar2;
        this.K0 = context2;
    }

    @Override
    public final void f() {
        ci.j1 j1Var;
        int i3 = this.C0;
        super.f();
        org.telegram.ui.cw cwVar = this.L0;
        if (!cwVar.L0 && (j1Var = cwVar.f34748b0) != null) {
            j1Var.v0(0);
            cwVar.L0 = true;
        }
        if (b() != 0 || i3 == 0 || this.E0 > 0) {
            return;
        }
        cwVar.f34749c0.e(false, false);
    }
}
