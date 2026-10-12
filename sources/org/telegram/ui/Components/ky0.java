package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class ky0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27947a;
    public final View f27948b;
    public final FrameLayout f27949c;

    public ky0(FrameLayout frameLayout, View view, int i10) {
        this.f27947a = i10;
        this.f27949c = frameLayout;
        this.f27948b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27947a) {
            case 0:
                ly0 ly0Var = (ly0) this.f27949c;
                ly0Var.f28307b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ly0Var.invalidate();
                ((un0) this.f27948b).invalidate();
                return;
            default:
                ((u91) this.f27949c).E(this.f27948b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
