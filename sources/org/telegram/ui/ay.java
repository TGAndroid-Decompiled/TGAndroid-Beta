package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ay implements ValueAnimator.AnimatorUpdateListener {
    public int f36234a;
    public final float f36235b;
    public final float f36236c;
    public final sy d;

    public ay(sy syVar, float f7, boolean z10, float f10) {
        this.d = syVar;
        this.f36235b = f7;
        this.f36236c = f10;
        this.f36234a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f36235b, this.f36236c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f36234a;
        this.f36234a = lerp;
        sy syVar = this.d;
        syVar.f41941e0[0].f41564a.scrollBy(0, i10);
        View view = syVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
