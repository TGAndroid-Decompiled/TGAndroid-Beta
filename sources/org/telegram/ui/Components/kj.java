package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class kj extends s4.d0 {
    public final ai.q f24737r;

    public kj(ai.q qVar, Context context) {
        super(context);
        this.f24737r = qVar;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.a2.z(7.0f, ((mj) this.f24737r.R).f25239n.getPaddingTop(), super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
