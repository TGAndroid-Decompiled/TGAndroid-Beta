package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ay implements ValueAnimator.AnimatorUpdateListener {
    public int f34992a;
    public final float f34993b;
    public final float f34994c;
    public final uy d;

    public ay(uy uyVar, float f7, boolean z10, float f10) {
        this.d = uyVar;
        this.f34993b = f7;
        this.f34994c = f10;
        this.f34992a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f34993b, this.f34994c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f34992a;
        this.f34992a = lerp;
        uy uyVar = this.d;
        uyVar.f41435e0[0].f41046a.scrollBy(0, i10);
        View view = uyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
