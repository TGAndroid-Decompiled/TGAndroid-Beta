package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class nj extends s4.d0 {
    public final hg.g0 f26478r;

    public nj(hg.g0 g0Var, Context context) {
        super(context);
        this.f26478r = g0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.y0.z(8.0f, ((yj) this.f26478r.V).f30266s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
