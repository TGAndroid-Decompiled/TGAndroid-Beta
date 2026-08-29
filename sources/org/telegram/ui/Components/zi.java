package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class zi extends f2.k0 {
    public final mh.k f35352r;

    public zi(mh.k kVar, Context context) {
        super(context);
        this.f35352r = kVar;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.x3.z(7.0f, ((bj) this.f35352r.R).f27120n.getPaddingTop(), super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
