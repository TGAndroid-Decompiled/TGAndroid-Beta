package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class jn extends s4.d0 {
    public final hg.g0 f25453r;

    public jn(hg.g0 g0Var, Context context) {
        super(context);
        this.f25453r = g0Var;
    }

    @Override
    public final int k(int i10, View view) {
        int i11;
        vn vnVar = (vn) this.f25453r.V;
        if (vnVar.V0) {
            i10 = -1;
        }
        int k10 = super.k(i10, view);
        if (vnVar.V0) {
            k10 += AndroidUtilities.dp(160.0f);
        }
        if (!vnVar.V0) {
            k10 = org.telegram.messenger.f0.A(7.0f, vnVar.R0 - AndroidUtilities.statusBarHeight, k10);
        }
        if (vnVar.V0 && k10 == 0 && (i11 = vnVar.W0) >= 0) {
            vn.K(vnVar, i11);
            vnVar.W0 = -1;
        }
        vnVar.V0 = false;
        return k10;
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
