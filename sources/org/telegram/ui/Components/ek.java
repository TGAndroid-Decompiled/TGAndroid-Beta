package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ek extends s4.d0 {
    public final hg.g0 f23680r;

    public ek(hg.g0 g0Var, Context context) {
        super(context);
        this.f23680r = g0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.y0.z(56.0f, ((ok) this.f23680r.V).f26821r.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
