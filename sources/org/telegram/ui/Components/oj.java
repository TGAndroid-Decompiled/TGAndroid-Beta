package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class oj extends s4.d0 {
    public final hg.g0 f26761r;

    public oj(hg.g0 g0Var, Context context) {
        super(context);
        this.f26761r = g0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.z0.z(8.0f, ((zj) this.f26761r.V).f30609s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
