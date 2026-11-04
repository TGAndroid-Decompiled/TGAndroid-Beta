package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class bw implements ValueAnimator.AnimatorUpdateListener {
    public int f44153a;
    public final float f44154b;
    public final float f44155c;
    public final uw d;

    public bw(uw uwVar, float f10, boolean z10, float f11) {
        this.d = uwVar;
        this.f44154b = f10;
        this.f44155c = f11;
        this.f44153a = (int) f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int T1 = (int) org.telegram.messenger.g0.T1(this.f44154b, this.f44155c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i3 = T1 - this.f44153a;
        this.f44153a = T1;
        uw uwVar = this.d;
        uwVar.f50230f0[0].f49897a.scrollBy(0, i3);
        View view = uwVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
