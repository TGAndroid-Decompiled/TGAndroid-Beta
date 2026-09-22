package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class yk extends s4.d0 {
    public final hg.g0 f30272r;

    public yk(hg.g0 g0Var, Context context) {
        super(context);
        this.f30272r = g0Var;
    }

    @Override
    public final int k(int i10, View view) {
        int k10 = super.k(i10, view);
        gl glVar = (gl) this.f30272r.V;
        return k10 - (glVar.P.getPaddingTop() - (glVar.A0 - glVar.f24415z0));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
