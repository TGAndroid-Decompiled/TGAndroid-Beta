package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class gn extends f2.k0 {
    public final gj f27201r;

    public gn(gj gjVar, Context context) {
        super(context);
        this.f27201r = gjVar;
    }

    @Override
    public final int k(int i10, View view) {
        int i11;
        rn rnVar = (rn) this.f27201r.V;
        if (rnVar.S0) {
            i10 = -1;
        }
        int k10 = super.k(i10, view);
        if (rnVar.S0) {
            k10 += AndroidUtilities.dp(160.0f);
        }
        if (!rnVar.S0) {
            k10 = org.telegram.messenger.y3.z(7.0f, rnVar.O0 - AndroidUtilities.statusBarHeight, k10);
        }
        if (rnVar.S0 && k10 == 0 && (i11 = rnVar.T0) >= 0) {
            rn.J(rnVar, i11);
            rnVar.T0 = -1;
        }
        rnVar.S0 = false;
        return k10;
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
