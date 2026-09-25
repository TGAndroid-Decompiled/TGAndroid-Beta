package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class fk extends s4.d0 {
    public final hg.g0 f24204r;

    public fk(hg.g0 g0Var, Context context) {
        super(context);
        this.f24204r = g0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.f0.A(56.0f, ((pk) this.f24204r.V).f27374r.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
