package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class yy extends hx0 {
    public final zy A3;
    public final int f30726z3;

    public yy(zy zyVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        super(context, i10, d6Var);
        this.A3 = zyVar;
        this.f30726z3 = i11;
    }

    @Override
    public final boolean A1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final void E1(int i10) {
        boolean z10;
        zw zwVar;
        qx qxVar;
        super.E1(i10);
        zy zyVar = this.A3;
        mz mzVar = zyVar.G;
        yy yyVar = zyVar.f31004r;
        boolean z11 = true;
        if (yyVar.getSelectedCategory() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = mz.O2;
        mzVar.M(z10);
        int i12 = this.f30726z3;
        if (i12 == 1 && (qxVar = mzVar.I) != null) {
            if (yyVar.getSelectedCategory() != null) {
                z11 = false;
            }
            qxVar.n(z11);
        } else if (i12 == 0 && (zwVar = mzVar.B0) != null) {
            if (yyVar.getSelectedCategory() != null) {
                z11 = false;
            }
            zwVar.f29142o0 = z11;
            zwVar.invalidate();
        }
        zyVar.g(false);
    }
}
