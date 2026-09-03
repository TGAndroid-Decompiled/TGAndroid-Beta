package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class rk extends f2.j0 {
    public final ej f28482r;

    public rk(ej ejVar, Context context) {
        super(context);
        this.f28482r = ejVar;
    }

    @Override
    public final int k(int i10, View view) {
        int k10 = super.k(i10, view);
        al alVar = (al) this.f28482r.V;
        return k10 - (alVar.M.getPaddingTop() - (alVar.f23426x0 - alVar.f23424w0));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
