package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ij extends s4.c0 {
    public final ci.k f25644r;

    public ij(ci.k kVar, Context context) {
        super(context);
        this.f25644r = kVar;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.g0.A(7.0f, ((kj) this.f25644r.R).f26394n.getPaddingTop(), super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
