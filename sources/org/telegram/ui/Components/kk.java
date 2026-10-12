package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class kk extends s4.e0 {
    public final hg.f0 f27871r;

    public kk(hg.f0 f0Var, Context context) {
        super(context);
        this.f27871r = f0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.v0.z(56.0f, ((uk) this.f27871r.V).f31186r.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
