package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class fz extends ux0 {
    public final int A3;
    public final gz B3;

    public fz(gz gzVar, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11) {
        super(context, i10, g6Var);
        this.B3 = gzVar;
        this.A3 = i11;
    }

    @Override
    public final boolean G1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final void K1(int i10) {
        boolean z10;
        ex exVar;
        vx vxVar;
        super.K1(i10);
        gz gzVar = this.B3;
        tz tzVar = gzVar.G;
        fz fzVar = gzVar.f26745r;
        boolean z11 = true;
        if (fzVar.getSelectedCategory() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = tz.U2;
        tzVar.M(z10);
        int i12 = this.A3;
        if (i12 == 1 && (vxVar = tzVar.I) != null) {
            if (fzVar.getSelectedCategory() != null) {
                z11 = false;
            }
            vxVar.n(z11);
        } else if (i12 == 0 && (exVar = tzVar.B0) != null) {
            if (fzVar.getSelectedCategory() != null) {
                z11 = false;
            }
            exVar.f28086o0 = z11;
            exVar.invalidate();
        }
        gzVar.g(false);
    }
}
