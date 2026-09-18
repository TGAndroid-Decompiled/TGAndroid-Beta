package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class fy implements ValueAnimator.AnimatorUpdateListener {
    public int f33792a;
    public final float f33793b;
    public final float f33794c;
    public final wy d;

    public fy(wy wyVar, float f7, boolean z10, float f10) {
        this.d = wyVar;
        this.f33793b = f7;
        this.f33794c = f10;
        this.f33792a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f33793b, this.f33794c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f33792a;
        this.f33792a = lerp;
        wy wyVar = this.d;
        wyVar.f39221e0[0].f38527a.scrollBy(0, i10);
        View view = wyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
