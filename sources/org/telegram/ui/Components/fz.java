package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class fz extends px0 {
    public final int f26410x3;
    public final gz y3;

    public fz(gz gzVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        super(context, i10, d6Var);
        this.y3 = gzVar;
        this.f26410x3 = i11;
    }

    @Override
    public final boolean B1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final void F1(int i10) {
        boolean z10;
        ex exVar;
        vx vxVar;
        super.F1(i10);
        gz gzVar = this.y3;
        tz tzVar = gzVar.G;
        fz fzVar = gzVar.f26698r;
        boolean z11 = true;
        if (fzVar.getSelectedCategory() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = tz.O2;
        tzVar.M(z10);
        int i12 = this.f26410x3;
        if (i12 == 1 && (vxVar = tzVar.I) != null) {
            if (fzVar.getSelectedCategory() != null) {
                z11 = false;
            }
            vxVar.n(z11);
        } else if (i12 == 0 && (exVar = tzVar.B0) != null) {
            if (fzVar.getSelectedCategory() != null) {
                z11 = false;
            }
            exVar.f26613o0 = z11;
            exVar.invalidate();
        }
        gzVar.g(false);
    }
}
