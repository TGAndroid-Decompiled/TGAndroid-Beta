package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ak extends v4.d0 {
    public final kg.d0 f33485r;

    public ak(kg.d0 d0Var, Context context) {
        super(context);
        this.f33485r = d0Var;
    }

    @Override
    public final int k(int i7, View view) {
        return org.telegram.messenger.f3.B(56.0f, ((kk) this.f33485r.V).f36766r.getPaddingTop() - org.telegram.messenger.g0.f24220m, super.k(i7, view));
    }

    @Override
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
