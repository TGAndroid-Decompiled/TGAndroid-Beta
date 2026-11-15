package org.telegram.ui.Components;

import android.content.Context;
public final class xx extends av0 {
    public final int H3;
    public final yx I3;

    public xx(yx yxVar, Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(i7, context, e6Var);
        this.I3 = yxVar;
        this.H3 = i10;
    }

    @Override
    public final boolean D1() {
        return org.telegram.messenger.qc.e(8200);
    }

    @Override
    public final void H1(int i7) {
        boolean z10;
        zv zvVar;
        qw qwVar;
        super.H1(i7);
        yx yxVar = this.I3;
        ly lyVar = yxVar.H;
        xx xxVar = yxVar.f42179r;
        boolean z11 = true;
        if (xxVar.getSelectedCategory() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = ly.V2;
        lyVar.N(z10);
        int i11 = this.H3;
        if (i11 == 1 && (qwVar = lyVar.J) != null) {
            if (xxVar.getSelectedCategory() != null) {
                z11 = false;
            }
            qwVar.n(z11);
        } else if (i11 == 0 && (zvVar = lyVar.C0) != null) {
            if (xxVar.getSelectedCategory() != null) {
                z11 = false;
            }
            zvVar.f41393p0 = z11;
            zvVar.invalidate();
        }
        yxVar.g(false);
    }
}
