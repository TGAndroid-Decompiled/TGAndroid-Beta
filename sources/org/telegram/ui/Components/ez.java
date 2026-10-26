package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class ez extends by0 {
    public final int H3;
    public final fz I3;

    public ez(fz fzVar, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var, int i11) {
        super(context, i10, u6Var);
        this.I3 = fzVar;
        this.H3 = i11;
    }

    @Override
    public final boolean G1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final void K1(int i10) {
        boolean z10;
        dx dxVar;
        ux uxVar;
        super.K1(i10);
        fz fzVar = this.I3;
        sz szVar = fzVar.G;
        ez ezVar = fzVar.f28341r;
        boolean z11 = true;
        if (ezVar.getSelectedCategory() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = sz.S2;
        szVar.M(z10);
        int i12 = this.H3;
        if (i12 == 1 && (uxVar = szVar.I) != null) {
            if (ezVar.getSelectedCategory() != null) {
                z11 = false;
            }
            uxVar.n(z11);
        } else if (i12 == 0 && (dxVar = szVar.B0) != null) {
            if (ezVar.getSelectedCategory() != null) {
                z11 = false;
            }
            dxVar.f31629o0 = z11;
            dxVar.invalidate();
        }
        fzVar.g(false);
    }
}
