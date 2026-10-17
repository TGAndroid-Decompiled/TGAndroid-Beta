package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class mj extends s4.c0 {
    public final ig.e0 f28527r;

    public mj(ig.e0 e0Var, Context context) {
        super(context);
        this.f28527r = e0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.q.A(8.0f, ((xj) this.f28527r.V).f32403s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
