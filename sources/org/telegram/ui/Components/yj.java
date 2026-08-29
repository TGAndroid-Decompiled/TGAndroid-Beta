package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class yj extends f2.k0 {
    public final gj f35082r;

    public yj(gj gjVar, Context context) {
        super(context);
        this.f35082r = gjVar;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.x3.z(56.0f, ((jk) this.f35082r.V).f29678r.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
