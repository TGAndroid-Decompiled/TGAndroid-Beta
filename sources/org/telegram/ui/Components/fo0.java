package org.telegram.ui.Components;

import android.content.Context;
public final class fo0 extends gg.i0 {
    public final org.telegram.ui.ty I0;
    public final Context J0;
    public final org.telegram.ui.ay K0;

    public fo0(org.telegram.ui.ay ayVar, Context context, org.telegram.ui.ty tyVar, int i10, int i11, s4.j jVar, boolean z10, org.telegram.ui.ty tyVar2, Context context2) {
        super(context, tyVar, i10, i11, jVar, z10);
        this.K0 = ayVar;
        this.I0 = tyVar2;
        this.J0 = context2;
    }

    @Override
    public final void l() {
        ai.w0 w0Var;
        int i10 = this.B0;
        super.l();
        org.telegram.ui.ay ayVar = this.K0;
        if (!ayVar.J0 && (w0Var = ayVar.W) != null) {
            w0Var.v0(0);
            ayVar.J0 = true;
        }
        if (h() != 0 || i10 == 0 || this.D0 > 0) {
            return;
        }
        ayVar.f26494a0.e(false, false);
    }
}
