package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class hx implements ValueAnimator.AnimatorUpdateListener {
    public int f40094a;
    public final float f40095b;
    public final float f40096c;
    public final cy d;

    public hx(cy cyVar, float f7, boolean z10, float f10) {
        this.d = cyVar;
        this.f40095b = f7;
        this.f40096c = f10;
        this.f40094a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f40095b, this.f40096c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f40094a;
        this.f40094a = lerp;
        cy cyVar = this.d;
        cyVar.f38583e0[0].f37910a.scrollBy(0, i10);
        View view = cyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
