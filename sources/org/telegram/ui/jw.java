package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class jw implements ValueAnimator.AnimatorUpdateListener {
    public int f49075a;
    public final float f49076b;
    public final float f49077c;
    public final cx d;

    public jw(cx cxVar, float f10, boolean z10, float f11) {
        this.d = cxVar;
        this.f49076b = f10;
        this.f49077c = f11;
        this.f49075a = (int) f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int T1 = (int) org.telegram.messenger.g0.T1(this.f49076b, this.f49077c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i7 = T1 - this.f49075a;
        this.f49075a = T1;
        cx cxVar = this.d;
        cxVar.f46683f0[0].f46318a.scrollBy(0, i7);
        View view = cxVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
