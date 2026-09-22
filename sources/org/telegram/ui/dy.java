package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class dy implements ValueAnimator.AnimatorUpdateListener {
    public int f33121a;
    public final float f33122b;
    public final float f33123c;
    public final uy d;

    public dy(uy uyVar, float f7, boolean z10, float f10) {
        this.d = uyVar;
        this.f33122b = f7;
        this.f33123c = f10;
        this.f33121a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f33122b, this.f33123c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f33121a;
        this.f33121a = lerp;
        uy uyVar = this.d;
        uyVar.f38222e0[0].f37752a.scrollBy(0, i10);
        View view = uyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
