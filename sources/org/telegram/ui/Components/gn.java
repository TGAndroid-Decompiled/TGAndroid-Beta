package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class gn extends v4.d0 {
    public final kg.d0 f35499r;

    public gn(kg.d0 d0Var, Context context) {
        super(context);
        this.f35499r = d0Var;
    }

    @Override
    public final int k(int i7, View view) {
        int i10;
        qn qnVar = (qn) this.f35499r.V;
        if (qnVar.W0) {
            i7 = -1;
        }
        int k10 = super.k(i7, view);
        if (qnVar.W0) {
            k10 += org.telegram.messenger.g0.L(160.0f);
        }
        if (!qnVar.W0) {
            k10 = org.telegram.messenger.f3.B(7.0f, qnVar.S0 - org.telegram.messenger.g0.f24220m, k10);
        }
        if (qnVar.W0 && k10 == 0 && (i10 = qnVar.X0) >= 0) {
            qn.P(qnVar, i10);
            qnVar.X0 = -1;
        }
        qnVar.W0 = false;
        return k10;
    }

    @Override
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
