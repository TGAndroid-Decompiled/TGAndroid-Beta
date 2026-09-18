package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class dy implements ValueAnimator.AnimatorUpdateListener {
    public int f33119a;
    public final float f33120b;
    public final float f33121c;
    public final uy d;

    public dy(uy uyVar, float f7, boolean z10, float f10) {
        this.d = uyVar;
        this.f33120b = f7;
        this.f33121c = f10;
        this.f33119a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f33120b, this.f33121c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f33119a;
        this.f33119a = lerp;
        uy uyVar = this.d;
        uyVar.f38149e0[0].f37826a.scrollBy(0, i10);
        View view = uyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
