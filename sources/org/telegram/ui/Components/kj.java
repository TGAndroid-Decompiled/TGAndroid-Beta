package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class kj extends s4.c0 {
    public final ig.d0 f28022r;

    public kj(ig.d0 d0Var, Context context) {
        super(context);
        this.f28022r = d0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.v0.z(8.0f, ((vj) this.f28022r.V).f31466s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
