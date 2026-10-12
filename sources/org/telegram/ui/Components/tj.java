package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class tj extends s4.e0 {
    public final hg.f0 f30887r;

    public tj(hg.f0 f0Var, Context context) {
        super(context);
        this.f30887r = f0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.v0.z(8.0f, ((ek) this.f30887r.V).f25718s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
