package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class tk extends f2.k0 {
    public final gj f31368r;

    public tk(gj gjVar, Context context) {
        super(context);
        this.f31368r = gjVar;
    }

    @Override
    public final int k(int i10, View view) {
        int k10 = super.k(i10, view);
        cl clVar = (cl) this.f31368r.V;
        return k10 - (clVar.M.getPaddingTop() - (clVar.f26000x0 - clVar.f25998w0));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
