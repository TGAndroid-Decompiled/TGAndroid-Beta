package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ym extends f2.n0 {
    public final dj f35027r;

    public ym(dj djVar, Context context) {
        super(context);
        this.f35027r = djVar;
    }

    @Override
    public final int k(int i9, View view) {
        int i10;
        jn jnVar = (jn) this.f35027r.V;
        if (jnVar.R0) {
            i9 = -1;
        }
        int k10 = super.k(i9, view);
        if (jnVar.R0) {
            k10 += AndroidUtilities.dp(160.0f);
        }
        if (!jnVar.R0) {
            k10 = org.telegram.messenger.l0.A(7.0f, jnVar.N0 - AndroidUtilities.statusBarHeight, k10);
        }
        if (jnVar.R0 && k10 == 0 && (i10 = jnVar.S0) >= 0) {
            jn.J(jnVar, i10);
            jnVar.S0 = -1;
        }
        jnVar.R0 = false;
        return k10;
    }

    @Override
    public final int m(int i9) {
        return super.m(i9) * 2;
    }
}
