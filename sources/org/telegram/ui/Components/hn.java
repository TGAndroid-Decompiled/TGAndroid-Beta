package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class hn extends f2.k0 {
    public final gj f27518r;

    public hn(gj gjVar, Context context) {
        super(context);
        this.f27518r = gjVar;
    }

    @Override
    public final int k(int i10, View view) {
        int i11;
        sn snVar = (sn) this.f27518r.V;
        if (snVar.S0) {
            i10 = -1;
        }
        int k10 = super.k(i10, view);
        if (snVar.S0) {
            k10 += AndroidUtilities.dp(160.0f);
        }
        if (!snVar.S0) {
            k10 = org.telegram.messenger.y3.z(7.0f, snVar.O0 - AndroidUtilities.statusBarHeight, k10);
        }
        if (snVar.S0 && k10 == 0 && (i11 = snVar.T0) >= 0) {
            sn.J(snVar, i11);
            snVar.T0 = -1;
        }
        snVar.S0 = false;
        return k10;
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
