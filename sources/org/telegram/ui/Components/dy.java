package org.telegram.ui.Components;

import android.content.Context;
public final class dy extends iv0 {
    public final int H3;
    public final ey I3;

    public dy(ey eyVar, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, int i10) {
        super(i7, context, i6Var);
        this.I3 = eyVar;
        this.H3 = i10;
    }

    @Override
    public final boolean D1() {
        return org.telegram.messenger.pc.e(8200);
    }

    @Override
    public final void H1(int i7) {
        boolean z10;
        fw fwVar;
        ww wwVar;
        super.H1(i7);
        ey eyVar = this.I3;
        ry ryVar = eyVar.H;
        dy dyVar = eyVar.f34841r;
        boolean z11 = true;
        if (dyVar.getSelectedCategory() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = ry.V2;
        ryVar.N(z10);
        int i11 = this.H3;
        if (i11 == 1 && (wwVar = ryVar.J) != null) {
            if (dyVar.getSelectedCategory() != null) {
                z11 = false;
            }
            wwVar.n(z11);
        } else if (i11 == 0 && (fwVar = ryVar.C0) != null) {
            if (dyVar.getSelectedCategory() != null) {
                z11 = false;
            }
            fwVar.f34755p0 = z11;
            fwVar.invalidate();
        }
        eyVar.g(false);
    }
}
