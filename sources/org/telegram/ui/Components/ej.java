package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ej extends s4.c0 {
    public final di.k f26061r;

    public ej(di.k kVar, Context context) {
        super(context);
        this.f26061r = kVar;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.v0.z(7.0f, ((gj) this.f26061r.R).f26698n.getPaddingTop(), super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
