package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class qm extends v4.c0 {
    public final kg.c0 f37332r;

    public qm(kg.c0 c0Var, Context context) {
        super(context);
        this.f37332r = c0Var;
    }

    @Override
    public final int k(int i7, View view) {
        int i10;
        an anVar = (an) this.f37332r.V;
        if (anVar.V0) {
            i7 = -1;
        }
        int k10 = super.k(i7, view);
        if (anVar.V0) {
            k10 += org.telegram.messenger.g0.L(160.0f);
        }
        if (!anVar.V0) {
            k10 = org.telegram.messenger.k5.B(7.0f, anVar.R0 - org.telegram.messenger.g0.f22561m, k10);
        }
        if (anVar.V0 && k10 == 0 && (i10 = anVar.W0) >= 0) {
            an.O(anVar, i10);
            anVar.W0 = -1;
        }
        anVar.V0 = false;
        return k10;
    }

    @Override
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
