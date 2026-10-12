package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class nj extends s4.e0 {
    public final bi.l f28802r;

    public nj(bi.l lVar, Context context) {
        super(context);
        this.f28802r = lVar;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.v0.z(7.0f, ((pj) this.f28802r.R).f29508n.getPaddingTop(), super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
