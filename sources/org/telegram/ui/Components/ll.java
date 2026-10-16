package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ll extends s4.c0 {
    public final ig.e0 f26764r;

    public ll(ig.e0 e0Var, Context context) {
        super(context);
        this.f26764r = e0Var;
    }

    @Override
    public final int k(int i10, View view) {
        int k10 = super.k(i10, view);
        tl tlVar = (tl) this.f26764r.V;
        return k10 - (tlVar.P.getPaddingTop() - (tlVar.A0 - tlVar.f29122z0));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
