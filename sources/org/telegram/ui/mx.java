package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class mx implements ValueAnimator.AnimatorUpdateListener {
    public int f39283a;
    public final float f39284b;
    public final float f39285c;
    public final ey d;

    public mx(ey eyVar, float f7, boolean z10, float f10) {
        this.d = eyVar;
        this.f39284b = f7;
        this.f39285c = f10;
        this.f39283a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f39284b, this.f39285c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f39283a;
        this.f39283a = lerp;
        ey eyVar = this.d;
        eyVar.f36653e0[0].f36337a.scrollBy(0, i10);
        View view = eyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
