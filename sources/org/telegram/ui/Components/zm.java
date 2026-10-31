package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class zm extends s4.b0 {
    public final ag.d1 f33129r;

    public zm(ag.d1 d1Var, Context context) {
        super(context);
        this.f33129r = d1Var;
    }

    @Override
    public final int k(int i10, View view) {
        int i11;
        jn jnVar = (jn) this.f33129r.V;
        if (jnVar.V0) {
            i10 = -1;
        }
        int k10 = super.k(i10, view);
        if (jnVar.V0) {
            k10 += org.telegram.messenger.i0.L(160.0f);
        }
        if (!jnVar.V0) {
            k10 = org.telegram.messenger.m5.B(7.0f, jnVar.R0 - org.telegram.messenger.i0.f16020m, k10);
        }
        if (jnVar.V0 && k10 == 0 && (i11 = jnVar.W0) >= 0) {
            jn.N(jnVar, i11);
            jnVar.W0 = -1;
        }
        jnVar.V0 = false;
        return k10;
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
