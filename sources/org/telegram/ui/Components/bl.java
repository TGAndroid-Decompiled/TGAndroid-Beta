package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class bl extends s4.d0 {
    public final hg.f0 f24997r;

    public bl(hg.f0 f0Var, Context context) {
        super(context);
        this.f24997r = f0Var;
    }

    @Override
    public final int k(int i10, View view) {
        int k10 = super.k(i10, view);
        jl jlVar = (jl) this.f24997r.V;
        return k10 - (jlVar.P.getPaddingTop() - (jlVar.A0 - jlVar.f27839z0));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
