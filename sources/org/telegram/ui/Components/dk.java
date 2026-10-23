package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class dk extends s4.c0 {
    public final ig.d0 f25664r;

    public dk(ig.d0 d0Var, Context context) {
        super(context);
        this.f25664r = d0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.v0.z(56.0f, ((nk) this.f25664r.V).f28977r.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
