package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class gw implements ValueAnimator.AnimatorUpdateListener {
    public int f47533a;
    public final float f47534b;
    public final float f47535c;
    public final yw d;

    public gw(yw ywVar, float f10, boolean z10, float f11) {
        this.d = ywVar;
        this.f47534b = f10;
        this.f47535c = f11;
        this.f47533a = (int) f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int T1 = (int) org.telegram.messenger.g0.T1(this.f47534b, this.f47535c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i7 = T1 - this.f47533a;
        this.f47533a = T1;
        yw ywVar = this.d;
        ywVar.f53673f0[0].f53331a.scrollBy(0, i7);
        View view = ywVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
