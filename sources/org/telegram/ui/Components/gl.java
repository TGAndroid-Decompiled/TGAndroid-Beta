package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class gl extends v4.d0 {
    public final kg.d0 f35467r;

    public gl(kg.d0 d0Var, Context context) {
        super(context);
        this.f35467r = d0Var;
    }

    @Override
    public final int k(int i7, View view) {
        int k10 = super.k(i7, view);
        kl klVar = (kl) this.f35467r.V;
        return k10 - (klVar.M.getPaddingTop() - (klVar.f36790r0 - klVar.f36788q0));
    }

    @Override
    public final int m(int i7) {
        return super.m(i7) * 4;
    }
}
