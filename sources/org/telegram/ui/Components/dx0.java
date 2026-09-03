package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class dx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26368a;
    public final View f26369b;
    public final FrameLayout f26370c;

    public dx0(FrameLayout frameLayout, View view, int i10) {
        this.f26368a = i10;
        this.f26370c = frameLayout;
        this.f26369b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26368a) {
            case 0:
                fx0 fx0Var = (fx0) this.f26370c;
                fx0Var.f27022b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fx0Var.invalidate();
                ((pm0) this.f26369b).invalidate();
                return;
            default:
                ((l81) this.f26370c).E(this.f26369b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
