package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class wy extends xw0 {
    public final xy A3;
    public final int f29794z3;

    public wy(xy xyVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(context, i10, f6Var);
        this.A3 = xyVar;
        this.f29794z3 = i11;
    }

    @Override
    public final boolean B1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final void F1(int i10) {
        boolean z10;
        ww wwVar;
        nx nxVar;
        super.F1(i10);
        xy xyVar = this.A3;
        kz kzVar = xyVar.G;
        wy wyVar = xyVar.f30029r;
        boolean z11 = true;
        if (wyVar.getSelectedCategory() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = kz.N2;
        kzVar.N(z10);
        int i12 = this.f29794z3;
        if (i12 == 1 && (nxVar = kzVar.I) != null) {
            if (wyVar.getSelectedCategory() != null) {
                z11 = false;
            }
            nxVar.n(z11);
        } else if (i12 == 0 && (wwVar = kzVar.B0) != null) {
            if (wyVar.getSelectedCategory() != null) {
                z11 = false;
            }
            wwVar.f25345o0 = z11;
            wwVar.invalidate();
        }
        xyVar.g(false);
    }
}
