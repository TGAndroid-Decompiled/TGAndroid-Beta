package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class tk extends s4.b0 {
    public final ag.d1 f30595r;

    public tk(ag.d1 d1Var, Context context) {
        super(context);
        this.f30595r = d1Var;
    }

    @Override
    public final int k(int i10, View view) {
        int k10 = super.k(i10, view);
        bl blVar = (bl) this.f30595r.V;
        return k10 - (blVar.N.getPaddingTop() - (blVar.f24822x0 - blVar.f24820w0));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
