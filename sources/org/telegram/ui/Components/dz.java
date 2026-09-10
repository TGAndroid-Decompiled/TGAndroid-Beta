package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class dz extends hx0 {
    public final ez A3;
    public final int f22509z3;

    public dz(ez ezVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(context, i10, f6Var);
        this.A3 = ezVar;
        this.f22509z3 = i11;
    }

    @Override
    public final void D1(int i10) {
        boolean z10;
        cx cxVar;
        ow owVar;
        super.D1(i10);
        ez ezVar = this.A3;
        rz rzVar = ezVar.G;
        dz dzVar = ezVar.f22784r;
        boolean z11 = true;
        if (dzVar.getSelectedCategory() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = rz.O2;
        rzVar.O(z10);
        int i12 = this.f22509z3;
        if (i12 == 1 && (owVar = rzVar.I) != null) {
            if (dzVar.getSelectedCategory() != null) {
                z11 = false;
            }
            owVar.n(z11);
        } else if (i12 == 0 && (cxVar = rzVar.B0) != null) {
            if (dzVar.getSelectedCategory() != null) {
                z11 = false;
            }
            cxVar.f27118o0 = z11;
            cxVar.invalidate();
        }
        ezVar.g(false);
    }

    @Override
    public final boolean z1() {
        return LiteMode.isEnabled(8200);
    }
}
