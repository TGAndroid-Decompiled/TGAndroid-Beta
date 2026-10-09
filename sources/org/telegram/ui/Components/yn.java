package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class yn extends s4.e0 {
    public final hg.f0 f33321r;

    public yn(hg.f0 f0Var, Context context) {
        super(context);
        this.f33321r = f0Var;
    }

    @Override
    public final int k(int i10, View view) {
        int i11;
        lo loVar = (lo) this.f33321r.V;
        if (loVar.V0) {
            i10 = -1;
        }
        int k10 = super.k(i10, view);
        if (loVar.V0) {
            k10 += AndroidUtilities.dp(160.0f);
        }
        if (!loVar.V0) {
            k10 = org.telegram.messenger.q.A(7.0f, loVar.R0 - AndroidUtilities.statusBarHeight, k10);
        }
        if (loVar.V0 && k10 == 0 && (i11 = loVar.W0) >= 0) {
            lo.N(loVar, i11);
            loVar.W0 = -1;
        }
        loVar.V0 = false;
        return k10;
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
