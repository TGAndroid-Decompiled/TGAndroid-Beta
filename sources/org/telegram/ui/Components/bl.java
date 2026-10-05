package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class bl extends s4.d0 {
    public final hg.f0 f25013r;

    public bl(hg.f0 f0Var, Context context) {
        super(context);
        this.f25013r = f0Var;
    }

    @Override
    public final int k(int i10, View view) {
        int k10 = super.k(i10, view);
        jl jlVar = (jl) this.f25013r.V;
        return k10 - (jlVar.P.getPaddingTop() - (jlVar.A0 - jlVar.f27906z0));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
