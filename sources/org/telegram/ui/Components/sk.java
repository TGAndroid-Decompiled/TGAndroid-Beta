package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class sk extends v4.c0 {
    public final kg.c0 f38115r;

    public sk(kg.c0 c0Var, Context context) {
        super(context);
        this.f38115r = c0Var;
    }

    @Override
    public final int k(int i7, View view) {
        int k10 = super.k(i7, view);
        wk wkVar = (wk) this.f38115r.V;
        return k10 - (wkVar.L.getPaddingTop() - (wkVar.f39996q0 - wkVar.f39995p0));
    }

    @Override
    public final int m(int i7) {
        return super.m(i7) * 4;
    }
}
