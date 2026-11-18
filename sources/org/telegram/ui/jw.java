package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class jw implements ValueAnimator.AnimatorUpdateListener {
    public int f49071a;
    public final float f49072b;
    public final float f49073c;
    public final cx d;

    public jw(cx cxVar, float f10, boolean z10, float f11) {
        this.d = cxVar;
        this.f49072b = f10;
        this.f49073c = f11;
        this.f49071a = (int) f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int T1 = (int) org.telegram.messenger.g0.T1(this.f49072b, this.f49073c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i7 = T1 - this.f49071a;
        this.f49071a = T1;
        cx cxVar = this.d;
        cxVar.f46663f0[0].f46298a.scrollBy(0, i7);
        View view = cxVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
