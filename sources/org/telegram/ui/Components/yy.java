package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class yy extends ix0 {
    public final zy A3;
    public final int f30801z3;

    public yy(zy zyVar, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var, int i11) {
        super(context, i10, e6Var);
        this.A3 = zyVar;
        this.f30801z3 = i11;
    }

    @Override
    public final boolean B1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final void F1(int i10) {
        boolean z10;
        yw ywVar;
        px pxVar;
        super.F1(i10);
        zy zyVar = this.A3;
        mz mzVar = zyVar.G;
        yy yyVar = zyVar.f30995r;
        boolean z11 = true;
        if (yyVar.getSelectedCategory() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = mz.M2;
        mzVar.M(z10);
        int i12 = this.f30801z3;
        if (i12 == 1 && (pxVar = mzVar.I) != null) {
            if (yyVar.getSelectedCategory() != null) {
                z11 = false;
            }
            pxVar.n(z11);
        } else if (i12 == 0 && (ywVar = mzVar.B0) != null) {
            if (yyVar.getSelectedCategory() != null) {
                z11 = false;
            }
            ywVar.f30065o0 = z11;
            ywVar.invalidate();
        }
        zyVar.g(false);
    }
}
