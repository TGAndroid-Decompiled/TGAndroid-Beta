package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class pk extends f2.n0 {
    public final dj f31685r;

    public pk(dj djVar, Context context) {
        super(context);
        this.f31685r = djVar;
    }

    @Override
    public final int k(int i9, View view) {
        int k10 = super.k(i9, view);
        xk xkVar = (xk) this.f31685r.V;
        return k10 - (xkVar.L.getPaddingTop() - (xkVar.f34713w0 - xkVar.f34711v0));
    }

    @Override
    public final int m(int i9) {
        return super.m(i9) * 4;
    }
}
