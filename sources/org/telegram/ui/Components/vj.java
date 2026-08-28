package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class vj extends f2.n0 {
    public final dj f33388r;

    public vj(dj djVar, Context context) {
        super(context);
        this.f33388r = djVar;
    }

    @Override
    public final int k(int i9, View view) {
        return org.telegram.messenger.l0.A(56.0f, ((fk) this.f33388r.V).f28459r.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i9, view));
    }

    @Override
    public final int m(int i9) {
        return super.m(i9) * 2;
    }
}
