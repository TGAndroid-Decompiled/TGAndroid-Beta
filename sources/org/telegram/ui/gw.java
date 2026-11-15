package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class gw implements ValueAnimator.AnimatorUpdateListener {
    public int f47523a;
    public final float f47524b;
    public final float f47525c;
    public final yw d;

    public gw(yw ywVar, float f10, boolean z10, float f11) {
        this.d = ywVar;
        this.f47524b = f10;
        this.f47525c = f11;
        this.f47523a = (int) f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int T1 = (int) org.telegram.messenger.g0.T1(this.f47524b, this.f47525c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i7 = T1 - this.f47523a;
        this.f47523a = T1;
        yw ywVar = this.d;
        ywVar.f53638f0[0].f53335a.scrollBy(0, i7);
        View view = ywVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
