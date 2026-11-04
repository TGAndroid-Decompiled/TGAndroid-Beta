package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ti extends u4.c0 {
    public final lg.d0 f38420r;

    public ti(lg.d0 d0Var, Context context) {
        super(context);
        this.f38420r = d0Var;
    }

    @Override
    public final int k(int i3, View view) {
        return org.telegram.messenger.k5.B(8.0f, ((ej) this.f38420r.V).f33406s.getPaddingTop() - org.telegram.messenger.g0.f22602m, super.k(i3, view));
    }

    @Override
    public final int m(int i3) {
        return super.m(i3) * 2;
    }
}
