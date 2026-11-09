package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class oi extends v4.c0 {
    public final ei.h f36721r;

    public oi(ei.h hVar, Context context) {
        super(context);
        this.f36721r = hVar;
    }

    @Override
    public final int k(int i7, View view) {
        return org.telegram.messenger.k5.B(7.0f, ((qi) this.f36721r.R).f37337n.getPaddingTop(), super.k(i7, view));
    }

    @Override
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
