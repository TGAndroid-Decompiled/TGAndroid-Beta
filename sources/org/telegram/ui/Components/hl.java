package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class hl extends s4.c0 {
    public final ig.d0 f27074r;

    public hl(ig.d0 d0Var, Context context) {
        super(context);
        this.f27074r = d0Var;
    }

    @Override
    public final int k(int i10, View view) {
        int k10 = super.k(i10, view);
        pl plVar = (pl) this.f27074r.V;
        return k10 - (plVar.N.getPaddingTop() - (plVar.f29615x0 - plVar.f29613w0));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
