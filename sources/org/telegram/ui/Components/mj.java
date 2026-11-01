package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class mj extends s4.b0 {
    public final ag.d1 f28506r;

    public mj(ag.d1 d1Var, Context context) {
        super(context);
        this.f28506r = d1Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.m5.B(56.0f, ((xj) this.f28506r.V).f32587r.getPaddingTop() - org.telegram.messenger.i0.f16166m, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
