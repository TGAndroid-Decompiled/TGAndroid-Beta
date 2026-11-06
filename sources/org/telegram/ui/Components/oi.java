package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class oi extends v4.c0 {
    public final ei.h f36624r;

    public oi(ei.h hVar, Context context) {
        super(context);
        this.f36624r = hVar;
    }

    @Override
    public final int k(int i7, View view) {
        return org.telegram.messenger.k5.B(7.0f, ((qi) this.f36624r.R).f37302n.getPaddingTop(), super.k(i7, view));
    }

    @Override
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
