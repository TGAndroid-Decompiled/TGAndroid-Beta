package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class sj extends v4.c0 {
    public final kg.c0 f39328r;

    public sj(kg.c0 c0Var, Context context) {
        super(context);
        this.f39328r = c0Var;
    }

    @Override
    public final int k(int i7, View view) {
        return org.telegram.messenger.k5.B(56.0f, ((dk) this.f39328r.V).f33965r.getPaddingTop() - org.telegram.messenger.g0.f23603m, super.k(i7, view));
    }

    @Override
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
