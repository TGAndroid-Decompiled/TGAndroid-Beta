package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class yj extends f2.k0 {
    public final gj f33550r;

    public yj(gj gjVar, Context context) {
        super(context);
        this.f33550r = gjVar;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.y3.z(56.0f, ((jk) this.f33550r.V).f28132r.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
