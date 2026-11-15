package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class zm extends v4.c0 {
    public final kg.c0 f42399r;

    public zm(kg.c0 c0Var, Context context) {
        super(context);
        this.f42399r = c0Var;
    }

    @Override
    public final int k(int i7, View view) {
        int i10;
        jn jnVar = (jn) this.f42399r.V;
        if (jnVar.W0) {
            i7 = -1;
        }
        int k10 = super.k(i7, view);
        if (jnVar.W0) {
            k10 += org.telegram.messenger.g0.L(160.0f);
        }
        if (!jnVar.W0) {
            k10 = org.telegram.messenger.k5.B(7.0f, jnVar.S0 - org.telegram.messenger.g0.f23605m, k10);
        }
        if (jnVar.W0 && k10 == 0 && (i10 = jnVar.X0) >= 0) {
            jn.P(jnVar, i10);
            jnVar.X0 = -1;
        }
        jnVar.W0 = false;
        return k10;
    }

    @Override
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
