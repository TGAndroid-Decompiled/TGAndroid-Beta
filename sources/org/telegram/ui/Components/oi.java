package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class oi extends u4.c0 {
    public final fi.g f36838r;

    public oi(fi.g gVar, Context context) {
        super(context);
        this.f36838r = gVar;
    }

    @Override
    public final int k(int i3, View view) {
        return org.telegram.messenger.k5.B(7.0f, ((qi) this.f36838r.R).f37464n.getPaddingTop(), super.k(i3, view));
    }

    @Override
    public final int m(int i3) {
        return super.m(i3) * 2;
    }
}
