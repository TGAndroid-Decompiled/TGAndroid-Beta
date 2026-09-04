package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class wy extends vw0 {
    public final xy A3;
    public final int f32366z3;

    public wy(xy xyVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(context, i10, f6Var);
        this.A3 = xyVar;
        this.f32366z3 = i11;
    }

    @Override
    public final void D1(int i10) {
        boolean z10;
        xw xwVar;
        jw jwVar;
        super.D1(i10);
        xy xyVar = this.A3;
        kz kzVar = xyVar.G;
        wy wyVar = xyVar.f32778r;
        boolean z11 = true;
        if (wyVar.getSelectedCategory() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = kz.O2;
        kzVar.O(z10);
        int i12 = this.f32366z3;
        if (i12 == 1 && (jwVar = kzVar.I) != null) {
            if (wyVar.getSelectedCategory() != null) {
                z11 = false;
            }
            jwVar.n(z11);
        } else if (i12 == 0 && (xwVar = kzVar.B0) != null) {
            if (wyVar.getSelectedCategory() != null) {
                z11 = false;
            }
            xwVar.f27183o0 = z11;
            xwVar.invalidate();
        }
        xyVar.g(false);
    }

    @Override
    public final boolean z1() {
        return LiteMode.isEnabled(8200);
    }
}
