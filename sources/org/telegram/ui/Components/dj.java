package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class dj extends f2.j0 {
    public final ej f24295r;

    public dj(ej ejVar, Context context) {
        super(context);
        this.f24295r = ejVar;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.y3.z(8.0f, ((qj) this.f24295r.V).f28194s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
