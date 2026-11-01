package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class iw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27189a;
    public final View f27190b;
    public final FrameLayout f27191c;

    public iw0(FrameLayout frameLayout, View view, int i10) {
        this.f27189a = i10;
        this.f27191c = frameLayout;
        this.f27190b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27189a) {
            case 0:
                kw0 kw0Var = (kw0) this.f27191c;
                kw0Var.f27965b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kw0Var.invalidate();
                ((vl0) this.f27190b).invalidate();
                return;
            default:
                ((x71) this.f27191c).F(this.f27190b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
