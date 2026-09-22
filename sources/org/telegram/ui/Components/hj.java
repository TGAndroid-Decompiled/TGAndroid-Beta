package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class hj extends s4.d0 {
    public final bi.l f24709r;

    public hj(bi.l lVar, Context context) {
        super(context);
        this.f24709r = lVar;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.y0.z(7.0f, ((jj) this.f24709r.R).f25351n.getPaddingTop(), super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
