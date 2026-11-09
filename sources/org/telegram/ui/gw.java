package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class gw implements ValueAnimator.AnimatorUpdateListener {
    public int f46077a;
    public final float f46078b;
    public final float f46079c;
    public final yw d;

    public gw(yw ywVar, float f10, boolean z9, float f11) {
        this.d = ywVar;
        this.f46078b = f10;
        this.f46079c = f11;
        this.f46077a = (int) f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int T1 = (int) org.telegram.messenger.g0.T1(this.f46078b, this.f46079c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i7 = T1 - this.f46077a;
        this.f46077a = T1;
        yw ywVar = this.d;
        ywVar.f52231e0[0].f51772a.scrollBy(0, i7);
        View view = ywVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
