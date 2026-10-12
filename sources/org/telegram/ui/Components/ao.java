package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ao extends s4.e0 {
    public final hg.f0 f24451r;

    public ao(hg.f0 f0Var, Context context) {
        super(context);
        this.f24451r = f0Var;
    }

    @Override
    public final int k(int i10, View view) {
        int i11;
        no noVar = (no) this.f24451r.V;
        if (noVar.V0) {
            i10 = -1;
        }
        int k10 = super.k(i10, view);
        if (noVar.V0) {
            k10 += AndroidUtilities.dp(160.0f);
        }
        if (!noVar.V0) {
            k10 = org.telegram.messenger.v0.z(7.0f, noVar.R0 - AndroidUtilities.statusBarHeight, k10);
        }
        if (noVar.V0 && k10 == 0 && (i11 = noVar.W0) >= 0) {
            no.N(noVar, i11);
            noVar.W0 = -1;
        }
        noVar.V0 = false;
        return k10;
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
