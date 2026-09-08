package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class hn extends s4.d0 {
    public final ig.e0 f26788r;

    public hn(ig.e0 e0Var, Context context) {
        super(context);
        this.f26788r = e0Var;
    }

    @Override
    public final int k(int i10, View view) {
        int i11;
        tn tnVar = (tn) this.f26788r.V;
        if (tnVar.V0) {
            i10 = -1;
        }
        int k10 = super.k(i10, view);
        if (tnVar.V0) {
            k10 += AndroidUtilities.dp(160.0f);
        }
        if (!tnVar.V0) {
            k10 = org.telegram.messenger.w1.z(7.0f, tnVar.R0 - AndroidUtilities.statusBarHeight, k10);
        }
        if (tnVar.V0 && k10 == 0 && (i11 = tnVar.W0) >= 0) {
            tn.K(tnVar, i11);
            tnVar.W0 = -1;
        }
        tnVar.V0 = false;
        return k10;
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
