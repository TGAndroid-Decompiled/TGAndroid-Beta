package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class rl extends s4.e0 {
    public final hg.f0 f30177r;

    public rl(hg.f0 f0Var, Context context) {
        super(context);
        this.f30177r = f0Var;
    }

    @Override
    public final int k(int i10, View view) {
        int k10 = super.k(i10, view);
        zl zlVar = (zl) this.f30177r.V;
        return k10 - (zlVar.P.getPaddingTop() - (zlVar.A0 - zlVar.f33428z0));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
