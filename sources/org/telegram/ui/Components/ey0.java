package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class ey0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26177a;
    public final View f26178b;
    public final FrameLayout f26179c;

    public ey0(FrameLayout frameLayout, View view, int i10) {
        this.f26177a = i10;
        this.f26179c = frameLayout;
        this.f26178b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26177a) {
            case 0:
                fy0 fy0Var = (fy0) this.f26179c;
                fy0Var.f26508b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fy0Var.invalidate();
                ((on0) this.f26178b).invalidate();
                return;
            default:
                ((o91) this.f26179c).E(this.f26178b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
