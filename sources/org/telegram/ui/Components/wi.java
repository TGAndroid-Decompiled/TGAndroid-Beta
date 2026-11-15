package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class wi extends v4.c0 {
    public final gi.g f41355r;

    public wi(gi.g gVar, Context context) {
        super(context);
        this.f41355r = gVar;
    }

    @Override
    public final int k(int i7, View view) {
        return org.telegram.messenger.k5.B(7.0f, ((yi) this.f41355r.R).f42003n.getPaddingTop(), super.k(i7, view));
    }

    @Override
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
