package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ti extends v4.c0 {
    public final kg.c0 f38329r;

    public ti(kg.c0 c0Var, Context context) {
        super(context);
        this.f38329r = c0Var;
    }

    @Override
    public final int k(int i7, View view) {
        return org.telegram.messenger.k5.B(8.0f, ((fj) this.f38329r.V).f33554s.getPaddingTop() - org.telegram.messenger.g0.f22538m, super.k(i7, view));
    }

    @Override
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
