package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class mx implements ValueAnimator.AnimatorUpdateListener {
    public int f39668a;
    public final float f39669b;
    public final float f39670c;
    public final ey d;

    public mx(ey eyVar, float f7, boolean z10, float f10) {
        this.d = eyVar;
        this.f39669b = f7;
        this.f39670c = f10;
        this.f39668a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f39669b, this.f39670c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f39668a;
        this.f39668a = lerp;
        ey eyVar = this.d;
        eyVar.f37034e0[0].f36737a.scrollBy(0, i10);
        View view = eyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
