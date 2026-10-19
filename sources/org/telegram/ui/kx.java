package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class kx implements ValueAnimator.AnimatorUpdateListener {
    public int f38671a;
    public final float f38672b;
    public final float f38673c;
    public final cy d;

    public kx(cy cyVar, float f7, boolean z10, float f10) {
        this.d = cyVar;
        this.f38672b = f7;
        this.f38673c = f10;
        this.f38671a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f38672b, this.f38673c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f38671a;
        this.f38671a = lerp;
        cy cyVar = this.d;
        cyVar.f36085e0[0].f35436a.scrollBy(0, i10);
        View view = cyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
