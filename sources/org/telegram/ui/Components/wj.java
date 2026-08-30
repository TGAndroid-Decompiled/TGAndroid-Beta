package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class wj extends f2.j0 {
    public final ej f30378r;

    public wj(ej ejVar, Context context) {
        super(context);
        this.f30378r = ejVar;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.y3.z(56.0f, ((hk) this.f30378r.V).f25434r.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
