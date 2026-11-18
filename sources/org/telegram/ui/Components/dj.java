package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class dj extends v4.d0 {
    public final gi.g f34448r;

    public dj(gi.g gVar, Context context) {
        super(context);
        this.f34448r = gVar;
    }

    @Override
    public final int k(int i7, View view) {
        return org.telegram.messenger.f3.B(7.0f, ((fj) this.f34448r.R).f35114n.getPaddingTop(), super.k(i7, view));
    }

    @Override
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
