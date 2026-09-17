package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class hj extends s4.d0 {
    public final ci.k f26767r;

    public hj(ci.k kVar, Context context) {
        super(context);
        this.f26767r = kVar;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.w1.z(7.0f, ((jj) this.f26767r.R).f27541n.getPaddingTop(), super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
