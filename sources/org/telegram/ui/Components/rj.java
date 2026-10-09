package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class rj extends s4.e0 {
    public final hg.f0 f30452r;

    public rj(hg.f0 f0Var, Context context) {
        super(context);
        this.f30452r = f0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.q.A(8.0f, ((ck) this.f30452r.V).f25390s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
