package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class bk extends v4.d0 {
    public final kg.d0 f33857r;

    public bk(kg.d0 d0Var, Context context) {
        super(context);
        this.f33857r = d0Var;
    }

    @Override
    public final int k(int i7, View view) {
        return org.telegram.messenger.f3.B(56.0f, ((mk) this.f33857r.V).f37536r.getPaddingTop() - org.telegram.messenger.g0.f24140m, super.k(i7, view));
    }

    @Override
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
