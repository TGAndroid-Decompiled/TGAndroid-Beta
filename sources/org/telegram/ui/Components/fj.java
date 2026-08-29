package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class fj extends f2.k0 {
    public final gj f28410r;

    public fj(gj gjVar, Context context) {
        super(context);
        this.f28410r = gjVar;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.x3.z(8.0f, ((sj) this.f28410r.V).f32656s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
