package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ni extends s4.b0 {
    public final oi f28854r;

    public ni(oi oiVar, Context context) {
        super(context);
        this.f28854r = oiVar;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.m5.B(7.0f, ((qi) this.f28854r.R).f29733n.getPaddingTop(), super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
