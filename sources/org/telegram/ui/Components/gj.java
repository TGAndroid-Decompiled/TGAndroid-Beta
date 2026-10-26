package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class gj extends s4.d0 {
    public final ei.k f28580r;

    public gj(ei.k kVar, Context context) {
        super(context);
        this.f28580r = kVar;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.t.B(7.0f, ((ij) this.f28580r.R).f29297n.getPaddingTop(), super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
