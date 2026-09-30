package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class qj extends s4.d0 {
    public final hg.g0 f27660r;

    public qj(hg.g0 g0Var, Context context) {
        super(context);
        this.f27660r = g0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.f0.A(8.0f, ((bk) this.f27660r.V).f22965s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
