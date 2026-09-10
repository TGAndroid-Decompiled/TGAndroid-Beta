package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class dl extends s4.d0 {
    public final gg.j0 f22443r;

    public dl(gg.j0 j0Var, Context context) {
        super(context);
        this.f22443r = j0Var;
    }

    @Override
    public final int k(int i10, View view) {
        int k10 = super.k(i10, view);
        ll llVar = (ll) this.f22443r.V;
        return k10 - (llVar.P.getPaddingTop() - (llVar.A0 - llVar.f25054z0));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
