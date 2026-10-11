package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class mz extends ay0 {
    public final int f28879x3;
    public final nz y3;

    public mz(nz nzVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        super(context, i10, d6Var);
        this.y3 = nzVar;
        this.f28879x3 = i11;
    }

    @Override
    public final boolean B1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final void F1(int i10) {
        boolean z10;
        nx nxVar;
        fy fyVar;
        super.F1(i10);
        nz nzVar = this.y3;
        b00 b00Var = nzVar.G;
        mz mzVar = nzVar.f29185r;
        boolean z11 = true;
        if (mzVar.getSelectedCategory() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = b00.O2;
        b00Var.M(z10);
        int i12 = this.f28879x3;
        if (i12 == 1 && (fyVar = b00Var.I) != null) {
            if (mzVar.getSelectedCategory() != null) {
                z11 = false;
            }
            fyVar.n(z11);
        } else if (i12 == 0 && (nxVar = b00Var.B0) != null) {
            if (mzVar.getSelectedCategory() != null) {
                z11 = false;
            }
            nxVar.f30205o0 = z11;
            nxVar.invalidate();
        }
        nzVar.g(false);
    }
}
