package org.telegram.ui.Components;

import android.content.Context;
public final class an0 extends zf.z {
    public final org.telegram.ui.zx I0;
    public final Context J0;
    public final org.telegram.ui.jx K0;

    public an0(org.telegram.ui.jx jxVar, Context context, org.telegram.ui.zx zxVar, int i10, int i11, s4.j jVar, boolean z10, org.telegram.ui.zx zxVar2, Context context2) {
        super(context, zxVar, i10, i11, jVar, z10);
        this.K0 = jxVar;
        this.I0 = zxVar2;
        this.J0 = context2;
    }

    @Override
    public final void f() {
        ag.b1 b1Var;
        int i10 = this.B0;
        super.f();
        org.telegram.ui.jx jxVar = this.K0;
        if (!jxVar.K0 && (b1Var = jxVar.f26869a0) != null) {
            b1Var.v0(0);
            jxVar.K0 = true;
        }
        if (b() != 0 || i10 == 0 || this.D0 > 0) {
            return;
        }
        jxVar.f26870b0.e(false, false);
    }
}
