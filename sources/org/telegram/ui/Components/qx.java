package org.telegram.ui.Components;

import android.content.Context;
public final class qx extends xu0 {
    public final int H3;
    public final rx I3;

    public qx(rx rxVar, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(i3, context, e6Var);
        this.I3 = rxVar;
        this.H3 = i10;
    }

    @Override
    public final boolean D1() {
        return org.telegram.messenger.lc.e(8200);
    }

    @Override
    public final void H1(int i3) {
        boolean z10;
        sv svVar;
        jw jwVar;
        super.H1(i3);
        rx rxVar = this.I3;
        ey eyVar = rxVar.H;
        qx qxVar = rxVar.f37831r;
        boolean z11 = true;
        if (qxVar.getSelectedCategory() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = ey.V2;
        eyVar.M(z10);
        int i11 = this.H3;
        if (i11 == 1 && (jwVar = eyVar.J) != null) {
            if (qxVar.getSelectedCategory() != null) {
                z11 = false;
            }
            jwVar.n(z11);
        } else if (i11 == 0 && (svVar = eyVar.C0) != null) {
            if (qxVar.getSelectedCategory() != null) {
                z11 = false;
            }
            svVar.f39165p0 = z11;
            svVar.invalidate();
        }
        rxVar.g(false);
    }
}
