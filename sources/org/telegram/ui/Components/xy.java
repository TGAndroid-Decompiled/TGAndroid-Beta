package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class xy extends yw0 {
    public final int f33199w3;
    public final yy f33200x3;

    public xy(yy yyVar, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11) {
        super(context, i10, g6Var);
        this.f33200x3 = yyVar;
        this.f33199w3 = i11;
    }

    @Override
    public final boolean A1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final void E1(int i10) {
        boolean z4;
        vw vwVar;
        hw hwVar;
        super.E1(i10);
        yy yyVar = this.f33200x3;
        mz mzVar = yyVar.D;
        xy xyVar = yyVar.f33646r;
        boolean z10 = true;
        if (xyVar.getSelectedCategory() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        int i11 = mz.L2;
        mzVar.O(z4);
        int i12 = this.f33199w3;
        if (i12 == 1 && (hwVar = mzVar.F) != null) {
            if (xyVar.getSelectedCategory() != null) {
                z10 = false;
            }
            hwVar.n(z10);
        } else if (i12 == 0 && (vwVar = mzVar.f29343y0) != null) {
            if (xyVar.getSelectedCategory() != null) {
                z10 = false;
            }
            vwVar.f30438l0 = z10;
            vwVar.invalidate();
        }
        yyVar.g(false);
    }
}
