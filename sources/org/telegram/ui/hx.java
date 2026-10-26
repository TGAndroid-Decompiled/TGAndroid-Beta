package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class hx implements ValueAnimator.AnimatorUpdateListener {
    public int f40097a;
    public final float f40098b;
    public final float f40099c;
    public final cy d;

    public hx(cy cyVar, float f7, boolean z10, float f10) {
        this.d = cyVar;
        this.f40098b = f7;
        this.f40099c = f10;
        this.f40097a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f40098b, this.f40099c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f40097a;
        this.f40097a = lerp;
        cy cyVar = this.d;
        cyVar.f38586e0[0].f37913a.scrollBy(0, i10);
        View view = cyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
