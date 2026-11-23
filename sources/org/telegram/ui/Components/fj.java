package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class fj extends v4.d0 {
    public final gi.g f35242r;

    public fj(gi.g gVar, Context context) {
        super(context);
        this.f35242r = gVar;
    }

    @Override
    public final int k(int i7, View view) {
        return org.telegram.messenger.f3.B(7.0f, ((hj) this.f35242r.R).f35915n.getPaddingTop(), super.k(i7, view));
    }

    @Override
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
