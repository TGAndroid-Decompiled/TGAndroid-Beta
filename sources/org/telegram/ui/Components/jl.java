package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class jl extends s4.c0 {
    public final ig.d0 f27708r;

    public jl(ig.d0 d0Var, Context context) {
        super(context);
        this.f27708r = d0Var;
    }

    @Override
    public final int k(int i10, View view) {
        int k10 = super.k(i10, view);
        rl rlVar = (rl) this.f27708r.V;
        return k10 - (rlVar.N.getPaddingTop() - (rlVar.f30219y0 - rlVar.f30217x0));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
