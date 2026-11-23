package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class iw implements ValueAnimator.AnimatorUpdateListener {
    public int f48931a;
    public final float f48932b;
    public final float f48933c;
    public final bx d;

    public iw(bx bxVar, float f10, boolean z10, float f11) {
        this.d = bxVar;
        this.f48932b = f10;
        this.f48933c = f11;
        this.f48931a = (int) f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int T1 = (int) org.telegram.messenger.g0.T1(this.f48932b, this.f48933c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i7 = T1 - this.f48931a;
        this.f48931a = T1;
        bx bxVar = this.d;
        bxVar.f46549f0[0].f45822a.scrollBy(0, i7);
        View view = bxVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
