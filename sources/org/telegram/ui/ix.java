package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class ix implements ValueAnimator.AnimatorUpdateListener {
    public int f38202a;
    public final float f38203b;
    public final float f38204c;
    public final zx d;

    public ix(zx zxVar, float f7, boolean z10, float f10) {
        this.d = zxVar;
        this.f38203b = f7;
        this.f38204c = f10;
        this.f38202a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int T1 = (int) org.telegram.messenger.i0.T1(this.f38203b, this.f38204c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = T1 - this.f38202a;
        this.f38202a = T1;
        zx zxVar = this.d;
        zxVar.f44137e0[0].f43733a.scrollBy(0, i10);
        View view = zxVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
