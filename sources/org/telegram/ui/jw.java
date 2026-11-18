package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class jw implements ValueAnimator.AnimatorUpdateListener {
    public int f49094a;
    public final float f49095b;
    public final float f49096c;
    public final cx d;

    public jw(cx cxVar, float f10, boolean z10, float f11) {
        this.d = cxVar;
        this.f49095b = f10;
        this.f49096c = f11;
        this.f49094a = (int) f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int T1 = (int) org.telegram.messenger.g0.T1(this.f49095b, this.f49096c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i7 = T1 - this.f49094a;
        this.f49094a = T1;
        cx cxVar = this.d;
        cxVar.f46683f0[0].f46307a.scrollBy(0, i7);
        View view = cxVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
