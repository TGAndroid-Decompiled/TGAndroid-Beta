package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class fk extends s4.c0 {
    public final ig.e0 f24770r;

    public fk(ig.e0 e0Var, Context context) {
        super(context);
        this.f24770r = e0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.g0.A(56.0f, ((pk) this.f24770r.V).f28042r.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
