package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class dz extends tx0 {
    public final int A3;
    public final ez B3;

    public dz(ez ezVar, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11) {
        super(context, i10, g6Var);
        this.B3 = ezVar;
        this.A3 = i11;
    }

    @Override
    public final boolean G1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final void K1(int i10) {
        boolean z10;
        cx cxVar;
        tx txVar;
        super.K1(i10);
        ez ezVar = this.B3;
        rz rzVar = ezVar.G;
        dz dzVar = ezVar.f26147r;
        boolean z11 = true;
        if (dzVar.getSelectedCategory() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = rz.U2;
        rzVar.M(z10);
        int i12 = this.A3;
        if (i12 == 1 && (txVar = rzVar.I) != null) {
            if (dzVar.getSelectedCategory() != null) {
                z11 = false;
            }
            txVar.n(z11);
        } else if (i12 == 0 && (cxVar = rzVar.B0) != null) {
            if (dzVar.getSelectedCategory() != null) {
                z11 = false;
            }
            cxVar.f27747o0 = z11;
            cxVar.invalidate();
        }
        ezVar.g(false);
    }
}
