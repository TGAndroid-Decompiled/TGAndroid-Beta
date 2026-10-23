package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class kx implements ValueAnimator.AnimatorUpdateListener {
    public int f38682a;
    public final float f38683b;
    public final float f38684c;
    public final cy d;

    public kx(cy cyVar, float f7, boolean z10, float f10) {
        this.d = cyVar;
        this.f38683b = f7;
        this.f38684c = f10;
        this.f38682a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f38683b, this.f38684c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f38682a;
        this.f38682a = lerp;
        cy cyVar = this.d;
        cyVar.f36096e0[0].f35447a.scrollBy(0, i10);
        View view = cyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
