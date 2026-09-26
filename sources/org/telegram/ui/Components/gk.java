package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class gk extends s4.d0 {
    public final hg.g0 f24516r;

    public gk(hg.g0 g0Var, Context context) {
        super(context);
        this.f24516r = g0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.f0.A(56.0f, ((qk) this.f24516r.V).f27705r.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
