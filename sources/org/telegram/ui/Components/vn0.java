package org.telegram.ui.Components;

import android.content.Context;
public final class vn0 extends tf.z {
    public final org.telegram.ui.qy F0;
    public final Context G0;
    public final org.telegram.ui.zx H0;

    public vn0(org.telegram.ui.zx zxVar, Context context, org.telegram.ui.qy qyVar, int i10, int i11, f2.l lVar, boolean z4, org.telegram.ui.qy qyVar2, Context context2) {
        super(context, qyVar, i10, i11, lVar, z4);
        this.H0 = zxVar;
        this.F0 = qyVar2;
        this.G0 = context2;
    }

    @Override
    public final void l() {
        lh.e1 e1Var;
        int i10 = this.f44984y0;
        super.l();
        org.telegram.ui.zx zxVar = this.H0;
        if (!zxVar.F0 && (e1Var = zxVar.S) != null) {
            e1Var.u0(0);
            zxVar.F0 = true;
        }
        if (h() != 0 || i10 == 0 || this.A0 > 0) {
            return;
        }
        zxVar.T.e(false, false);
    }
}
