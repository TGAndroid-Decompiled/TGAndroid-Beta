package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class gj extends s4.c0 {
    public final di.k f26572r;

    public gj(di.k kVar, Context context) {
        super(context);
        this.f26572r = kVar;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.g0.A(7.0f, ((ij) this.f26572r.R).f27239n.getPaddingTop(), super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
