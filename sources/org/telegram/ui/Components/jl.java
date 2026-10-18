package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class jl extends s4.c0 {
    public final ig.e0 f27560r;

    public jl(ig.e0 e0Var, Context context) {
        super(context);
        this.f27560r = e0Var;
    }

    @Override
    public final int k(int i10, View view) {
        int k10 = super.k(i10, view);
        rl rlVar = (rl) this.f27560r.V;
        return k10 - (rlVar.P.getPaddingTop() - (rlVar.A0 - rlVar.f29999z0));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
