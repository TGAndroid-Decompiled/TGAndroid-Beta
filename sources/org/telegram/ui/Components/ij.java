package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ij extends s4.d0 {
    public final bi.l f24985r;

    public ij(bi.l lVar, Context context) {
        super(context);
        this.f24985r = lVar;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.z0.z(7.0f, ((kj) this.f24985r.R).f25607n.getPaddingTop(), super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
