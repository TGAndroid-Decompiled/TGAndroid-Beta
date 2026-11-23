package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class il extends v4.d0 {
    public final kg.d0 f36277r;

    public il(kg.d0 d0Var, Context context) {
        super(context);
        this.f36277r = d0Var;
    }

    @Override
    public final int k(int i7, View view) {
        int k10 = super.k(i7, view);
        ml mlVar = (ml) this.f36277r.V;
        return k10 - (mlVar.M.getPaddingTop() - (mlVar.f37564r0 - mlVar.f37562q0));
    }

    @Override
    public final int m(int i7) {
        return super.m(i7) * 4;
    }
}
