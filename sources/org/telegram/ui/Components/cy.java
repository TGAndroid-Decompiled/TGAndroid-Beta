package org.telegram.ui.Components;

import android.content.Context;
public final class cy extends kv0 {
    public final int H3;
    public final dy I3;

    public cy(dy dyVar, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, int i10) {
        super(i7, context, i6Var);
        this.I3 = dyVar;
        this.H3 = i10;
    }

    @Override
    public final boolean D1() {
        return org.telegram.messenger.pc.e(8200);
    }

    @Override
    public final void H1(int i7) {
        boolean z10;
        ew ewVar;
        vw vwVar;
        super.H1(i7);
        dy dyVar = this.I3;
        qy qyVar = dyVar.H;
        cy cyVar = dyVar.f34486r;
        boolean z11 = true;
        if (cyVar.getSelectedCategory() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = qy.V2;
        qyVar.N(z10);
        int i11 = this.H3;
        if (i11 == 1 && (vwVar = qyVar.J) != null) {
            if (cyVar.getSelectedCategory() != null) {
                z11 = false;
            }
            vwVar.n(z11);
        } else if (i11 == 0 && (ewVar = qyVar.C0) != null) {
            if (cyVar.getSelectedCategory() != null) {
                z11 = false;
            }
            ewVar.f35489p0 = z11;
            ewVar.invalidate();
        }
        dyVar.g(false);
    }
}
