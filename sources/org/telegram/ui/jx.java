package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class jx implements ValueAnimator.AnimatorUpdateListener {
    public int f38619a;
    public final float f38620b;
    public final float f38621c;
    public final ay d;

    public jx(ay ayVar, float f7, boolean z10, float f10) {
        this.d = ayVar;
        this.f38620b = f7;
        this.f38621c = f10;
        this.f38619a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int T1 = (int) org.telegram.messenger.i0.T1(this.f38620b, this.f38621c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = T1 - this.f38619a;
        this.f38619a = T1;
        ay ayVar = this.d;
        ayVar.f35794e0[0].f44239a.scrollBy(0, i10);
        View view = ayVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
