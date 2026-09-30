package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ln extends s4.d0 {
    public final hg.g0 f26058r;

    public ln(hg.g0 g0Var, Context context) {
        super(context);
        this.f26058r = g0Var;
    }

    @Override
    public final int k(int i10, View view) {
        int i11;
        xn xnVar = (xn) this.f26058r.V;
        if (xnVar.V0) {
            i10 = -1;
        }
        int k10 = super.k(i10, view);
        if (xnVar.V0) {
            k10 += AndroidUtilities.dp(160.0f);
        }
        if (!xnVar.V0) {
            k10 = org.telegram.messenger.f0.A(7.0f, xnVar.R0 - AndroidUtilities.statusBarHeight, k10);
        }
        if (xnVar.V0 && k10 == 0 && (i11 = xnVar.W0) >= 0) {
            xn.K(xnVar, i11);
            xnVar.W0 = -1;
        }
        xnVar.V0 = false;
        return k10;
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
