package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ml extends s4.c0 {
    public final ig.e0 f27408r;

    public ml(ig.e0 e0Var, Context context) {
        super(context);
        this.f27408r = e0Var;
    }

    @Override
    public final int k(int i10, View view) {
        int k10 = super.k(i10, view);
        ul ulVar = (ul) this.f27408r.V;
        return k10 - (ulVar.P.getPaddingTop() - (ulVar.A0 - ulVar.f29736z0));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
