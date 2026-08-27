package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

public final class si extends f2.l0 {

    public final kh.l f32452r;

    public si(kh.l lVar, Context context) {
        super(context);
        this.f32452r = lVar;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.y1.A(7.0f, ((ui) this.f32452r.R).f33086n.getPaddingTop(), super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
