package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class kj extends u4.c0 {
    public final lg.d0 f35419r;

    public kj(lg.d0 d0Var, Context context) {
        super(context);
        this.f35419r = d0Var;
    }

    @Override
    public final int k(int i3, View view) {
        return org.telegram.messenger.k5.B(56.0f, ((uj) this.f35419r.V).f38770r.getPaddingTop() - org.telegram.messenger.g0.f22602m, super.k(i3, view));
    }

    @Override
    public final int m(int i3) {
        return super.m(i3) * 2;
    }
}
