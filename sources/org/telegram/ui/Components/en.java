package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class en extends f2.j0 {
    public final ej f24638r;

    public en(ej ejVar, Context context) {
        super(context);
        this.f24638r = ejVar;
    }

    @Override
    public final int k(int i10, View view) {
        int i11;
        pn pnVar = (pn) this.f24638r.V;
        if (pnVar.S0) {
            i10 = -1;
        }
        int k10 = super.k(i10, view);
        if (pnVar.S0) {
            k10 += AndroidUtilities.dp(160.0f);
        }
        if (!pnVar.S0) {
            k10 = org.telegram.messenger.y3.z(7.0f, pnVar.O0 - AndroidUtilities.statusBarHeight, k10);
        }
        if (pnVar.S0 && k10 == 0 && (i11 = pnVar.T0) >= 0) {
            pn.J(pnVar, i11);
            pnVar.T0 = -1;
        }
        pnVar.S0 = false;
        return k10;
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
