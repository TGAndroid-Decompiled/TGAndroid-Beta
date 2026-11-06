package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class sk extends v4.c0 {
    public final kg.c0 f38079r;

    public sk(kg.c0 c0Var, Context context) {
        super(context);
        this.f38079r = c0Var;
    }

    @Override
    public final int k(int i7, View view) {
        int k10 = super.k(i7, view);
        wk wkVar = (wk) this.f38079r.V;
        return k10 - (wkVar.L.getPaddingTop() - (wkVar.f40011q0 - wkVar.f40010p0));
    }

    @Override
    public final int m(int i7) {
        return super.m(i7) * 4;
    }
}
