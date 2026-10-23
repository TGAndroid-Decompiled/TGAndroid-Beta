package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class oc0 implements ValueAnimator.AnimatorUpdateListener {
    public boolean f40133a;
    public final float[] f40134b = {0.0f, 1.0f};
    public final FrameLayout f40135c;
    public final pc0 d;

    public oc0(pc0 pc0Var, FrameLayout frameLayout) {
        this.d = pc0Var;
        this.f40135c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f40134b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f40133a) {
            pc0 pc0Var = this.d;
            sc0 sc0Var = pc0Var.f40450b;
            sc0 sc0Var2 = pc0Var.f40450b;
            if (sc0Var.f41365o0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(sc0Var2.f41365o0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(sc0Var2.f41365o0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(sc0Var2.f41365o0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f40133a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = org.telegram.ui.Components.bs.f25134g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (org.telegram.ui.Components.bs.f25134g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (org.telegram.ui.Components.bs.f25134g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f40135c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
