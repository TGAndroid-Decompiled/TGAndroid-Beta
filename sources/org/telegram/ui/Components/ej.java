package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ej extends v4.d0 {
    public final gi.g f34726r;

    public ej(gi.g gVar, Context context) {
        super(context);
        this.f34726r = gVar;
    }

    @Override
    public final int k(int i7, View view) {
        return org.telegram.messenger.f3.B(7.0f, ((gj) this.f34726r.R).f35451n.getPaddingTop(), super.k(i7, view));
    }

    @Override
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
