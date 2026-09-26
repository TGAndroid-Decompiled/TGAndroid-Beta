package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class nx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26885a;
    public final View f26886b;
    public final FrameLayout f26887c;

    public nx0(FrameLayout frameLayout, View view, int i10) {
        this.f26885a = i10;
        this.f26887c = frameLayout;
        this.f26886b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26885a) {
            case 0:
                ox0 ox0Var = (ox0) this.f26887c;
                ox0Var.f27129b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ox0Var.invalidate();
                ((vm0) this.f26886b).invalidate();
                return;
            default:
                ((x81) this.f26887c).E(this.f26886b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
