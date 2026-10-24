package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class qn extends s4.c0 {
    public final ig.d0 f29964r;

    public qn(ig.d0 d0Var, Context context) {
        super(context);
        this.f29964r = d0Var;
    }

    @Override
    public final int k(int i10, View view) {
        int i11;
        co coVar = (co) this.f29964r.V;
        if (coVar.V0) {
            i10 = -1;
        }
        int k10 = super.k(i10, view);
        if (coVar.V0) {
            k10 += AndroidUtilities.dp(160.0f);
        }
        if (!coVar.V0) {
            k10 = org.telegram.messenger.v0.z(7.0f, coVar.R0 - AndroidUtilities.statusBarHeight, k10);
        }
        if (coVar.V0 && k10 == 0 && (i11 = coVar.W0) >= 0) {
            co.N(coVar, i11);
            coVar.W0 = -1;
        }
        coVar.V0 = false;
        return k10;
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
