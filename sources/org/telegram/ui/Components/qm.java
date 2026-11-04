package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class qm extends u4.c0 {
    public final lg.d0 f37493r;

    public qm(lg.d0 d0Var, Context context) {
        super(context);
        this.f37493r = d0Var;
    }

    @Override
    public final int k(int i3, View view) {
        int i10;
        an anVar = (an) this.f37493r.V;
        if (anVar.W0) {
            i3 = -1;
        }
        int k10 = super.k(i3, view);
        if (anVar.W0) {
            k10 += org.telegram.messenger.g0.L(160.0f);
        }
        if (!anVar.W0) {
            k10 = org.telegram.messenger.k5.B(7.0f, anVar.S0 - org.telegram.messenger.g0.f22602m, k10);
        }
        if (anVar.W0 && k10 == 0 && (i10 = anVar.X0) >= 0) {
            an.O(anVar, i10);
            anVar.X0 = -1;
        }
        anVar.W0 = false;
        return k10;
    }

    @Override
    public final int m(int i3) {
        return super.m(i3) * 2;
    }
}
