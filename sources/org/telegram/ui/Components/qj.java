package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class qj extends s4.d0 {
    public final gg.j0 f26427r;

    public qj(gg.j0 j0Var, Context context) {
        super(context);
        this.f26427r = j0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.a2.z(8.0f, ((bk) this.f26427r.V).f21845s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
