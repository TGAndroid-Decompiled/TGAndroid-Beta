package org.telegram.ui.Components;

import android.content.Context;
public final class wn0 extends uf.z {
    public final org.telegram.ui.py F0;
    public final Context G0;
    public final org.telegram.ui.yx H0;

    public wn0(org.telegram.ui.yx yxVar, Context context, org.telegram.ui.py pyVar, int i10, int i11, f2.l lVar, boolean z4, org.telegram.ui.py pyVar2, Context context2) {
        super(context, pyVar, i10, i11, lVar, z4);
        this.H0 = yxVar;
        this.F0 = pyVar2;
        this.G0 = context2;
    }

    @Override
    public final void l() {
        mh.d1 d1Var;
        int i10 = this.f48819y0;
        super.l();
        org.telegram.ui.yx yxVar = this.H0;
        if (!yxVar.F0 && (d1Var = yxVar.S) != null) {
            d1Var.u0(0);
            yxVar.F0 = true;
        }
        if (h() != 0 || i10 == 0 || this.A0 > 0) {
            return;
        }
        yxVar.T.e(false, false);
    }
}
