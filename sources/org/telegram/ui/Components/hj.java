package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class hj extends s4.d0 {
    public final bi.l f24674r;

    public hj(bi.l lVar, Context context) {
        super(context);
        this.f24674r = lVar;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.w1.z(7.0f, ((jj) this.f24674r.R).f25303n.getPaddingTop(), super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
