package org.telegram.ui.Components;

import android.content.Context;
public final class fy extends lv0 {
    public final int H3;
    public final gy I3;

    public fy(gy gyVar, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, int i10) {
        super(i7, context, h6Var);
        this.I3 = gyVar;
        this.H3 = i10;
    }

    @Override
    public final boolean D1() {
        return org.telegram.messenger.qc.e(8200);
    }

    @Override
    public final void H1(int i7) {
        boolean z10;
        hw hwVar;
        yw ywVar;
        super.H1(i7);
        gy gyVar = this.I3;
        ty tyVar = gyVar.H;
        fy fyVar = gyVar.f35671r;
        boolean z11 = true;
        if (fyVar.getSelectedCategory() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = ty.V2;
        tyVar.N(z10);
        int i11 = this.H3;
        if (i11 == 1 && (ywVar = tyVar.J) != null) {
            if (fyVar.getSelectedCategory() != null) {
                z11 = false;
            }
            ywVar.n(z11);
        } else if (i11 == 0 && (hwVar = tyVar.C0) != null) {
            if (fyVar.getSelectedCategory() != null) {
                z11 = false;
            }
            hwVar.f35584p0 = z11;
            hwVar.invalidate();
        }
        gyVar.g(false);
    }
}
