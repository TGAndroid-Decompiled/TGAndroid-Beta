package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class ay0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23315a;
    public final View f23316b;
    public final FrameLayout f23317c;

    public ay0(FrameLayout frameLayout, View view, int i10) {
        this.f23315a = i10;
        this.f23317c = frameLayout;
        this.f23316b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23315a) {
            case 0:
                by0 by0Var = (by0) this.f23317c;
                by0Var.f23567b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                by0Var.invalidate();
                ((kn0) this.f23316b).invalidate();
                return;
            default:
                ((l91) this.f23317c).E(this.f23316b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
