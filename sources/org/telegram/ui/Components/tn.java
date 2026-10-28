package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class tn extends s4.d0 {
    public final jg.e0 f33111r;

    public tn(jg.e0 e0Var, Context context) {
        super(context);
        this.f33111r = e0Var;
    }

    @Override
    public final int k(int i10, View view) {
        int i11;
        go goVar = (go) this.f33111r.V;
        if (goVar.V0) {
            i10 = -1;
        }
        int k10 = super.k(i10, view);
        if (goVar.V0) {
            k10 += AndroidUtilities.dp(160.0f);
        }
        if (!goVar.V0) {
            k10 = org.telegram.messenger.t.B(7.0f, goVar.R0 - AndroidUtilities.statusBarHeight, k10);
        }
        if (goVar.V0 && k10 == 0 && (i11 = goVar.W0) >= 0) {
            go.N(goVar, i11);
            goVar.W0 = -1;
        }
        goVar.V0 = false;
        return k10;
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
