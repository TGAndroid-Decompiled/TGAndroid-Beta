package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class kx implements ValueAnimator.AnimatorUpdateListener {
    public int f38678a;
    public final float f38679b;
    public final float f38680c;
    public final cy d;

    public kx(cy cyVar, float f7, boolean z10, float f10) {
        this.d = cyVar;
        this.f38679b = f7;
        this.f38680c = f10;
        this.f38678a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f38679b, this.f38680c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f38678a;
        this.f38678a = lerp;
        cy cyVar = this.d;
        cyVar.f36092e0[0].f35443a.scrollBy(0, i10);
        View view = cyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
