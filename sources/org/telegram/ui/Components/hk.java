package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class hk extends s4.d0 {
    public final hg.f0 f27245r;

    public hk(hg.f0 f0Var, Context context) {
        super(context);
        this.f27245r = f0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.q.A(56.0f, ((rk) this.f27245r.V).f30521r.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
