package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class kj extends s4.d0 {
    public final bi.l f28208r;

    public kj(bi.l lVar, Context context) {
        super(context);
        this.f28208r = lVar;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.q.A(7.0f, ((mj) this.f28208r.R).f28713n.getPaddingTop(), super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
