package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class fk extends s4.d0 {
    public final hg.g0 f23998r;

    public fk(hg.g0 g0Var, Context context) {
        super(context);
        this.f23998r = g0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.z0.z(56.0f, ((pk) this.f23998r.V).f27068r.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
