package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class fy implements ValueAnimator.AnimatorUpdateListener {
    public int f33788a;
    public final float f33789b;
    public final float f33790c;
    public final wy d;

    public fy(wy wyVar, float f7, boolean z10, float f10) {
        this.d = wyVar;
        this.f33789b = f7;
        this.f33790c = f10;
        this.f33788a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f33789b, this.f33790c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f33788a;
        this.f33788a = lerp;
        wy wyVar = this.d;
        wyVar.f39215e0[0].f38522a.scrollBy(0, i10);
        View view = wyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
