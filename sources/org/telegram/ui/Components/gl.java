package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class gl extends v4.d0 {
    public final kg.c0 f35524r;

    public gl(kg.c0 c0Var, Context context) {
        super(context);
        this.f35524r = c0Var;
    }

    @Override
    public final int k(int i7, View view) {
        int k10 = super.k(i7, view);
        kl klVar = (kl) this.f35524r.V;
        return k10 - (klVar.M.getPaddingTop() - (klVar.f36811r0 - klVar.f36809q0));
    }

    @Override
    public final int m(int i7) {
        return super.m(i7) * 4;
    }
}
