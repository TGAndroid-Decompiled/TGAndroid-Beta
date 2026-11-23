package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class jj extends v4.d0 {
    public final kg.d0 f36422r;

    public jj(kg.d0 d0Var, Context context) {
        super(context);
        this.f36422r = d0Var;
    }

    @Override
    public final int k(int i7, View view) {
        return org.telegram.messenger.f3.B(8.0f, ((uj) this.f36422r.V).f40390s.getPaddingTop() - org.telegram.messenger.g0.f24220m, super.k(i7, view));
    }

    @Override
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
