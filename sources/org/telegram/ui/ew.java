package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class ew implements ValueAnimator.AnimatorUpdateListener {
    public int f45377a;
    public final float f45378b;
    public final float f45379c;
    public final ww d;

    public ew(ww wwVar, float f10, boolean z9, float f11) {
        this.d = wwVar;
        this.f45378b = f10;
        this.f45379c = f11;
        this.f45377a = (int) f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int T1 = (int) org.telegram.messenger.g0.T1(this.f45378b, this.f45379c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i7 = T1 - this.f45377a;
        this.f45377a = T1;
        ww wwVar = this.d;
        wwVar.f51556e0[0].f50782a.scrollBy(0, i7);
        View view = wwVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
