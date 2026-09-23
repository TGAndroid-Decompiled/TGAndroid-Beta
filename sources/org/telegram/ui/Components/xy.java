package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class xy extends vw0 {
    public final yy A3;
    public final int f30095z3;

    public xy(yy yyVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        super(context, i10, d6Var);
        this.A3 = yyVar;
        this.f30095z3 = i11;
    }

    @Override
    public final boolean A1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final void E1(int i10) {
        boolean z10;
        xw xwVar;
        ox oxVar;
        super.E1(i10);
        yy yyVar = this.A3;
        lz lzVar = yyVar.G;
        xy xyVar = yyVar.f30472r;
        boolean z11 = true;
        if (xyVar.getSelectedCategory() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = lz.O2;
        lzVar.M(z10);
        int i12 = this.f30095z3;
        if (i12 == 1 && (oxVar = lzVar.I) != null) {
            if (xyVar.getSelectedCategory() != null) {
                z11 = false;
            }
            oxVar.n(z11);
        } else if (i12 == 0 && (xwVar = lzVar.B0) != null) {
            if (xyVar.getSelectedCategory() != null) {
                z11 = false;
            }
            xwVar.f25368o0 = z11;
            xwVar.invalidate();
        }
        yyVar.g(false);
    }
}
