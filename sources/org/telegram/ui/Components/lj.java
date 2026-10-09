package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class lj extends s4.e0 {
    public final bi.l f28464r;

    public lj(bi.l lVar, Context context) {
        super(context);
        this.f28464r = lVar;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.q.A(7.0f, ((nj) this.f28464r.R).f29163n.getPaddingTop(), super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
