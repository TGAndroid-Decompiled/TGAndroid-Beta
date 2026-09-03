package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class yi extends f2.k0 {
    public final zi f33544r;

    public yi(zi ziVar, Context context) {
        super(context);
        this.f33544r = ziVar;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.y3.z(7.0f, ((bj) this.f33544r.R).f25612n.getPaddingTop(), super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
