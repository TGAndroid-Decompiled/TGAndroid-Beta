package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class kx implements ValueAnimator.AnimatorUpdateListener {
    public int f38681a;
    public final float f38682b;
    public final float f38683c;
    public final cy d;

    public kx(cy cyVar, float f7, boolean z10, float f10) {
        this.d = cyVar;
        this.f38682b = f7;
        this.f38683c = f10;
        this.f38681a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f38682b, this.f38683c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f38681a;
        this.f38681a = lerp;
        cy cyVar = this.d;
        cyVar.f36095e0[0].f35446a.scrollBy(0, i10);
        View view = cyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
