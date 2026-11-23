package org.telegram.ui.Components;

import android.content.Context;
public final class mm0 extends jg.h0 {
    public final org.telegram.ui.bx J0;
    public final Context K0;
    public final org.telegram.ui.jw L0;

    public mm0(org.telegram.ui.jw jwVar, Context context, org.telegram.ui.bx bxVar, int i7, int i10, v4.l lVar, boolean z10, org.telegram.ui.bx bxVar2, Context context2) {
        super(context, bxVar, i7, i10, lVar, z10);
        this.L0 = jwVar;
        this.J0 = bxVar2;
        this.K0 = context2;
    }

    @Override
    public final void f() {
        di.b1 b1Var;
        int i7 = this.C0;
        super.f();
        org.telegram.ui.jw jwVar = this.L0;
        if (!jwVar.L0 && (b1Var = jwVar.f40082b0) != null) {
            b1Var.v0(0);
            jwVar.L0 = true;
        }
        if (b() != 0 || i7 == 0 || this.E0 > 0) {
            return;
        }
        jwVar.f40083c0.e(false, false);
    }
}
