package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class oz extends ey0 {
    public final int f29327x3;
    public final pz y3;

    public oz(pz pzVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(context, i10, c6Var);
        this.y3 = pzVar;
        this.f29327x3 = i11;
    }

    @Override
    public final boolean B1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final void F1(int i10) {
        boolean z10;
        px pxVar;
        hy hyVar;
        super.F1(i10);
        pz pzVar = this.y3;
        d00 d00Var = pzVar.G;
        oz ozVar = pzVar.f29600r;
        boolean z11 = true;
        if (ozVar.getSelectedCategory() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = d00.O2;
        d00Var.M(z10);
        int i12 = this.f29327x3;
        if (i12 == 1 && (hyVar = d00Var.I) != null) {
            if (ozVar.getSelectedCategory() != null) {
                z11 = false;
            }
            hyVar.n(z11);
        } else if (i12 == 0 && (pxVar = d00Var.B0) != null) {
            if (ozVar.getSelectedCategory() != null) {
                z11 = false;
            }
            pxVar.f31218o0 = z11;
            pxVar.invalidate();
        }
        pzVar.g(false);
    }
}
