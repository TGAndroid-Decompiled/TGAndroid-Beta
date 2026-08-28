package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class cj extends f2.n0 {
    public final dj f27502r;

    public cj(dj djVar, Context context) {
        super(context);
        this.f27502r = djVar;
    }

    @Override
    public final int k(int i9, View view) {
        return org.telegram.messenger.l0.A(8.0f, ((pj) this.f27502r.V).f31679s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i9, view));
    }

    @Override
    public final int m(int i9) {
        return super.m(i9) * 2;
    }
}
