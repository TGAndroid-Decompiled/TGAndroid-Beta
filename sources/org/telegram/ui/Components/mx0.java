package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class mx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26582a;
    public final View f26583b;
    public final FrameLayout f26584c;

    public mx0(FrameLayout frameLayout, View view, int i10) {
        this.f26582a = i10;
        this.f26584c = frameLayout;
        this.f26583b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26582a) {
            case 0:
                nx0 nx0Var = (nx0) this.f26584c;
                nx0Var.f26810b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nx0Var.invalidate();
                ((um0) this.f26583b).invalidate();
                return;
            default:
                ((w81) this.f26584c).E(this.f26583b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
