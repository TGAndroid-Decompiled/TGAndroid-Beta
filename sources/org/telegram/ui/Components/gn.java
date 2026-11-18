package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class gn extends v4.d0 {
    public final kg.c0 f35530r;

    public gn(kg.c0 c0Var, Context context) {
        super(context);
        this.f35530r = c0Var;
    }

    @Override
    public final int k(int i7, View view) {
        int i10;
        rn rnVar = (rn) this.f35530r.V;
        if (rnVar.W0) {
            i7 = -1;
        }
        int k10 = super.k(i7, view);
        if (rnVar.W0) {
            k10 += org.telegram.messenger.g0.L(160.0f);
        }
        if (!rnVar.W0) {
            k10 = org.telegram.messenger.f3.B(7.0f, rnVar.S0 - org.telegram.messenger.g0.f24115m, k10);
        }
        if (rnVar.W0 && k10 == 0 && (i10 = rnVar.X0) >= 0) {
            rn.P(rnVar, i10);
            rnVar.X0 = -1;
        }
        rnVar.W0 = false;
        return k10;
    }

    @Override
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
