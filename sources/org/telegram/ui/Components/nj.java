package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class nj extends s4.d0 {
    public final ig.e0 f28799r;

    public nj(ig.e0 e0Var, Context context) {
        super(context);
        this.f28799r = e0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.w1.z(8.0f, ((yj) this.f28799r.V).f32960s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
