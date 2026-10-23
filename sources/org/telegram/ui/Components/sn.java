package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class sn extends s4.c0 {
    public final ig.d0 f30526r;

    public sn(ig.d0 d0Var, Context context) {
        super(context);
        this.f30526r = d0Var;
    }

    @Override
    public final int k(int i10, View view) {
        int i11;
        fo foVar = (fo) this.f30526r.V;
        if (foVar.V0) {
            i10 = -1;
        }
        int k10 = super.k(i10, view);
        if (foVar.V0) {
            k10 += AndroidUtilities.dp(160.0f);
        }
        if (!foVar.V0) {
            k10 = org.telegram.messenger.v0.z(7.0f, foVar.R0 - AndroidUtilities.statusBarHeight, k10);
        }
        if (foVar.V0 && k10 == 0 && (i11 = foVar.W0) >= 0) {
            fo.N(foVar, i11);
            foVar.W0 = -1;
        }
        foVar.V0 = false;
        return k10;
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
