package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class mx implements ValueAnimator.AnimatorUpdateListener {
    public int f39718a;
    public final float f39719b;
    public final float f39720c;
    public final ey d;

    public mx(ey eyVar, float f7, boolean z10, float f10) {
        this.d = eyVar;
        this.f39719b = f7;
        this.f39720c = f10;
        this.f39718a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f39719b, this.f39720c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f39718a;
        this.f39718a = lerp;
        ey eyVar = this.d;
        eyVar.f37059e0[0].f36750a.scrollBy(0, i10);
        View view = eyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
