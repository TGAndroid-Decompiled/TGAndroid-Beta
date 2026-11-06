package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class lj extends v4.c0 {
    public final kg.c0 f35685r;

    public lj(kg.c0 c0Var, Context context) {
        super(context);
        this.f35685r = c0Var;
    }

    @Override
    public final int k(int i7, View view) {
        return org.telegram.messenger.k5.B(56.0f, ((vj) this.f35685r.V).f38985r.getPaddingTop() - org.telegram.messenger.g0.f22538m, super.k(i7, view));
    }

    @Override
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
