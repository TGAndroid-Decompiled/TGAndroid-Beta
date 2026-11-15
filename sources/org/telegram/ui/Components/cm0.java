package org.telegram.ui.Components;

import android.content.Context;
public final class cm0 extends jg.h0 {
    public final org.telegram.ui.yw J0;
    public final Context K0;
    public final org.telegram.ui.hw L0;

    public cm0(org.telegram.ui.hw hwVar, Context context, org.telegram.ui.yw ywVar, int i7, int i10, v4.k kVar, boolean z10, org.telegram.ui.yw ywVar2, Context context2) {
        super(context, ywVar, i7, i10, kVar, z10);
        this.L0 = hwVar;
        this.J0 = ywVar2;
        this.K0 = context2;
    }

    @Override
    public final void f() {
        di.c1 c1Var;
        int i7 = this.C0;
        super.f();
        org.telegram.ui.hw hwVar = this.L0;
        if (!hwVar.L0 && (c1Var = hwVar.f36047b0) != null) {
            c1Var.v0(0);
            hwVar.L0 = true;
        }
        if (b() != 0 || i7 == 0 || this.E0 > 0) {
            return;
        }
        hwVar.f36048c0.e(false, false);
    }
}
