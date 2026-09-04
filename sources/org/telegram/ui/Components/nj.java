package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class nj extends s4.d0 {
    public final ig.e0 f28772r;

    public nj(ig.e0 e0Var, Context context) {
        super(context);
        this.f28772r = e0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.w1.z(8.0f, ((yj) this.f28772r.V).f32933s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
