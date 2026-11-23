package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class jw implements ValueAnimator.AnimatorUpdateListener {
    public int f49108a;
    public final float f49109b;
    public final float f49110c;
    public final cx d;

    public jw(cx cxVar, float f10, boolean z10, float f11) {
        this.d = cxVar;
        this.f49109b = f10;
        this.f49110c = f11;
        this.f49108a = (int) f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int T1 = (int) org.telegram.messenger.g0.T1(this.f49109b, this.f49110c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i7 = T1 - this.f49108a;
        this.f49108a = T1;
        cx cxVar = this.d;
        cxVar.f46722f0[0].f46325a.scrollBy(0, i7);
        View view = cxVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
