package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class kx implements ValueAnimator.AnimatorUpdateListener {
    public int f38677a;
    public final float f38678b;
    public final float f38679c;
    public final cy d;

    public kx(cy cyVar, float f7, boolean z10, float f10) {
        this.d = cyVar;
        this.f38678b = f7;
        this.f38679c = f10;
        this.f38677a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f38678b, this.f38679c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f38677a;
        this.f38677a = lerp;
        cy cyVar = this.d;
        cyVar.f36091e0[0].f35442a.scrollBy(0, i10);
        View view = cyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
