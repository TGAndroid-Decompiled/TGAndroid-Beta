package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class vy extends xw0 {
    public final int f30070w3;
    public final wy f30071x3;

    public vy(wy wyVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(context, i10, f6Var);
        this.f30071x3 = wyVar;
        this.f30070w3 = i11;
    }

    @Override
    public final void D1(int i10) {
        boolean z4;
        tw twVar;
        fw fwVar;
        super.D1(i10);
        wy wyVar = this.f30071x3;
        kz kzVar = wyVar.D;
        vy vyVar = wyVar.f30372r;
        boolean z10 = true;
        if (vyVar.getSelectedCategory() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        int i11 = kz.L2;
        kzVar.O(z4);
        int i12 = this.f30070w3;
        if (i12 == 1 && (fwVar = kzVar.F) != null) {
            if (vyVar.getSelectedCategory() != null) {
                z10 = false;
            }
            fwVar.n(z10);
        } else if (i12 == 0 && (twVar = kzVar.f26500y0) != null) {
            if (vyVar.getSelectedCategory() != null) {
                z10 = false;
            }
            twVar.f27609l0 = z10;
            twVar.invalidate();
        }
        wyVar.g(false);
    }

    @Override
    public final boolean z1() {
        return LiteMode.isEnabled(8200);
    }
}
