package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class hj extends s4.d0 {
    public final bi.l f24839r;

    public hj(bi.l lVar, Context context) {
        super(context);
        this.f24839r = lVar;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.l0.A(7.0f, ((jj) this.f24839r.R).f25384n.getPaddingTop(), super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
