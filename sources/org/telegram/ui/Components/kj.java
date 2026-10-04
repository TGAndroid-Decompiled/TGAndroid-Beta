package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class kj extends s4.d0 {
    public final bi.l f28122r;

    public kj(bi.l lVar, Context context) {
        super(context);
        this.f28122r = lVar;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.q.A(7.0f, ((mj) this.f28122r.R).f28634n.getPaddingTop(), super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
