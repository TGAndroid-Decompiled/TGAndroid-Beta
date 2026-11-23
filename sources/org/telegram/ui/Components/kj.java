package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class kj extends v4.c0 {
    public final kg.d0 f36888r;

    public kj(kg.d0 d0Var, Context context) {
        super(context);
        this.f36888r = d0Var;
    }

    @Override
    public final int k(int i7, View view) {
        return org.telegram.messenger.f3.B(8.0f, ((vj) this.f36888r.V).f40800s.getPaddingTop() - org.telegram.messenger.g0.f24004m, super.k(i7, view));
    }

    @Override
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
