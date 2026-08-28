package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class wi extends f2.n0 {
    public final jh.k f34232r;

    public wi(jh.k kVar, Context context) {
        super(context);
        this.f34232r = kVar;
    }

    @Override
    public final int k(int i9, View view) {
        return org.telegram.messenger.l0.A(7.0f, ((yi) this.f34232r.R).f34973n.getPaddingTop(), super.k(i9, view));
    }

    @Override
    public final int m(int i9) {
        return super.m(i9) * 2;
    }
}
