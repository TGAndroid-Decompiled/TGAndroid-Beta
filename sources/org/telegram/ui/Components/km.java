package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class km implements ValueAnimator.AnimatorUpdateListener {
    public final int f36828a;
    public final om f36829b;

    public km(om omVar, int i7) {
        this.f36828a = i7;
        this.f36829b = omVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36828a) {
            case 0:
                om omVar = this.f36829b;
                omVar.getClass();
                omVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                omVar.invalidate();
                return;
            default:
                om omVar2 = this.f36829b;
                omVar2.getClass();
                omVar2.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                omVar2.invalidate();
                return;
        }
    }
}
