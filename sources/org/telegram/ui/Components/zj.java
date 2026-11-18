package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class zj extends v4.d0 {
    public final kg.c0 f42894r;

    public zj(kg.c0 c0Var, Context context) {
        super(context);
        this.f42894r = c0Var;
    }

    @Override
    public final int k(int i7, View view) {
        return org.telegram.messenger.f3.B(56.0f, ((kk) this.f42894r.V).f36781r.getPaddingTop() - org.telegram.messenger.g0.f24115m, super.k(i7, view));
    }

    @Override
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
