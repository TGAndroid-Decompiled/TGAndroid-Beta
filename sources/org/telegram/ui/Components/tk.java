package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class tk extends s4.b0 {
    public final ag.d1 f30676r;

    public tk(ag.d1 d1Var, Context context) {
        super(context);
        this.f30676r = d1Var;
    }

    @Override
    public final int k(int i10, View view) {
        int k10 = super.k(i10, view);
        bl blVar = (bl) this.f30676r.V;
        return k10 - (blVar.N.getPaddingTop() - (blVar.f24877x0 - blVar.f24875w0));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
