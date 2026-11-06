package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class rm extends v4.c0 {
    public final kg.c0 f37802r;

    public rm(kg.c0 c0Var, Context context) {
        super(context);
        this.f37802r = c0Var;
    }

    @Override
    public final int k(int i7, View view) {
        int i10;
        bn bnVar = (bn) this.f37802r.V;
        if (bnVar.V0) {
            i7 = -1;
        }
        int k10 = super.k(i7, view);
        if (bnVar.V0) {
            k10 += org.telegram.messenger.g0.L(160.0f);
        }
        if (!bnVar.V0) {
            k10 = org.telegram.messenger.k5.B(7.0f, bnVar.R0 - org.telegram.messenger.g0.f22531m, k10);
        }
        if (bnVar.V0 && k10 == 0 && (i10 = bnVar.W0) >= 0) {
            bn.O(bnVar, i10);
            bnVar.W0 = -1;
        }
        bnVar.V0 = false;
        return k10;
    }

    @Override
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
