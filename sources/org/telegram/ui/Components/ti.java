package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ti extends s4.b0 {
    public final ag.d1 f30662r;

    public ti(ag.d1 d1Var, Context context) {
        super(context);
        this.f30662r = d1Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.m5.B(8.0f, ((ej) this.f30662r.V).f25848s.getPaddingTop() - org.telegram.messenger.i0.f16166m, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
