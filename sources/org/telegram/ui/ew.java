package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class ew implements ValueAnimator.AnimatorUpdateListener {
    public int f45419a;
    public final float f45420b;
    public final float f45421c;
    public final ww d;

    public ew(ww wwVar, float f10, boolean z9, float f11) {
        this.d = wwVar;
        this.f45420b = f10;
        this.f45421c = f11;
        this.f45419a = (int) f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int T1 = (int) org.telegram.messenger.g0.T1(this.f45420b, this.f45421c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i7 = T1 - this.f45419a;
        this.f45419a = T1;
        ww wwVar = this.d;
        wwVar.f51551e0[0].f50839a.scrollBy(0, i7);
        View view = wwVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
