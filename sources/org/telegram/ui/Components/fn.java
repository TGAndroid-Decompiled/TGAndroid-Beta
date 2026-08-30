package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class fn extends f2.j0 {
    public final ej f24905r;

    public fn(ej ejVar, Context context) {
        super(context);
        this.f24905r = ejVar;
    }

    @Override
    public final int k(int i10, View view) {
        int i11;
        qn qnVar = (qn) this.f24905r.V;
        if (qnVar.S0) {
            i10 = -1;
        }
        int k10 = super.k(i10, view);
        if (qnVar.S0) {
            k10 += AndroidUtilities.dp(160.0f);
        }
        if (!qnVar.S0) {
            k10 = org.telegram.messenger.y3.z(7.0f, qnVar.O0 - AndroidUtilities.statusBarHeight, k10);
        }
        if (qnVar.S0 && k10 == 0 && (i11 = qnVar.T0) >= 0) {
            qn.J(qnVar, i11);
            qnVar.T0 = -1;
        }
        qnVar.S0 = false;
        return k10;
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
