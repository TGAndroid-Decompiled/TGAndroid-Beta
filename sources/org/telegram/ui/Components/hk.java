package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class hk extends s4.d0 {
    public final hg.e0 f27148r;

    public hk(hg.e0 e0Var, Context context) {
        super(context);
        this.f27148r = e0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.f0.A(56.0f, ((rk) this.f27148r.V).f30433r.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
