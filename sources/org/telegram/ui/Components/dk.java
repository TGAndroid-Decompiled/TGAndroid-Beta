package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class dk extends s4.c0 {
    public final ig.e0 f25513r;

    public dk(ig.e0 e0Var, Context context) {
        super(context);
        this.f25513r = e0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.g0.A(56.0f, ((nk) this.f25513r.V).f28827r.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
