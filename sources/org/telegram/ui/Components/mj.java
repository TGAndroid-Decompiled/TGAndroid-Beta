package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class mj extends s4.d0 {
    public final jg.e0 f30546r;

    public mj(jg.e0 e0Var, Context context) {
        super(context);
        this.f30546r = e0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.t.B(8.0f, ((xj) this.f30546r.V).f34784s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
