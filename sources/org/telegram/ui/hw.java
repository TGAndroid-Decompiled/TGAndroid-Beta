package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class hw implements ValueAnimator.AnimatorUpdateListener {
    public int f46432a;
    public final float f46433b;
    public final float f46434c;
    public final zw d;

    public hw(zw zwVar, float f10, boolean z9, float f11) {
        this.d = zwVar;
        this.f46433b = f10;
        this.f46434c = f11;
        this.f46432a = (int) f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int T1 = (int) org.telegram.messenger.g0.T1(this.f46433b, this.f46434c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i7 = T1 - this.f46432a;
        this.f46432a = T1;
        zw zwVar = this.d;
        zwVar.f52577e0[0].f52125a.scrollBy(0, i7);
        View view = zwVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
