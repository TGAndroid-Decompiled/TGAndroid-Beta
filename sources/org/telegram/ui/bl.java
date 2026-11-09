package org.telegram.ui;

import android.app.Activity;
public final class bl extends fi.m3 {
    public final cn W0;

    public bl(cn cnVar, Activity activity) {
        super(activity, 3);
        this.W0 = cnVar;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        setTranslationY(((-getTop()) - org.telegram.messenger.g0.L(120.0f)) + this.W0.Q1);
    }
}
