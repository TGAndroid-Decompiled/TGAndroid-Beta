package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class zy extends rx0 {
    public final int G3;
    public final az H3;

    public zy(az azVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        super(context, i10, d6Var);
        this.H3 = azVar;
        this.G3 = i11;
    }

    @Override
    public final boolean C1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final void G1(int i10) {
        boolean z10;
        ax axVar;
        rx rxVar;
        super.G1(i10);
        az azVar = this.H3;
        nz nzVar = azVar.G;
        zy zyVar = azVar.f24717r;
        boolean z11 = true;
        if (zyVar.getSelectedCategory() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = nz.M2;
        nzVar.K(z10);
        int i12 = this.G3;
        if (i12 == 1 && (rxVar = nzVar.I) != null) {
            if (zyVar.getSelectedCategory() != null) {
                z11 = false;
            }
            rxVar.n(z11);
        } else if (i12 == 0 && (axVar = nzVar.B0) != null) {
            if (zyVar.getSelectedCategory() != null) {
                z11 = false;
            }
            axVar.f24597o0 = z11;
            axVar.invalidate();
        }
        azVar.g(false);
    }
}
