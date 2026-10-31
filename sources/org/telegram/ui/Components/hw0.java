package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class hw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26831a;
    public final View f26832b;
    public final FrameLayout f26833c;

    public hw0(FrameLayout frameLayout, View view, int i10) {
        this.f26831a = i10;
        this.f26833c = frameLayout;
        this.f26832b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26831a) {
            case 0:
                jw0 jw0Var = (jw0) this.f26833c;
                jw0Var.f27498b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jw0Var.invalidate();
                ((ul0) this.f26832b).invalidate();
                return;
            default:
                ((w71) this.f26833c).F(this.f26832b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
