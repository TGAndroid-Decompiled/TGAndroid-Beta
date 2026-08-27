package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class yi extends f2.l0 {

    public final zi f34908r;

    public yi(zi ziVar, Context context) {
        super(context);
        this.f34908r = ziVar;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.y1.A(8.0f, ((lj) this.f34908r.V).f30397s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
