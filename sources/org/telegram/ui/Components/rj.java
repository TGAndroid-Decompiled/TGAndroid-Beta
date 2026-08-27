package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class rj extends f2.l0 {

    public final zi f32193r;

    public rj(zi ziVar, Context context) {
        super(context);
        this.f32193r = ziVar;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.y1.A(56.0f, ((bk) this.f32193r.V).f27115r.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
