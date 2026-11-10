package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class kj extends v4.c0 {
    public final kg.c0 f35356r;

    public kj(kg.c0 c0Var, Context context) {
        super(context);
        this.f35356r = c0Var;
    }

    @Override
    public final int k(int i7, View view) {
        return org.telegram.messenger.k5.B(56.0f, ((uj) this.f35356r.V).f38698r.getPaddingTop() - org.telegram.messenger.g0.f22561m, super.k(i7, view));
    }

    @Override
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
