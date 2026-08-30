package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class xi extends f2.j0 {
    public final oh.k f30685r;

    public xi(oh.k kVar, Context context) {
        super(context);
        this.f30685r = kVar;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.y3.z(7.0f, ((zi) this.f30685r.R).f31347n.getPaddingTop(), super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
