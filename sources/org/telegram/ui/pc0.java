package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class pc0 implements ValueAnimator.AnimatorUpdateListener {

    public boolean f41322a;

    public final float[] f41323b = {0.0f, 1.0f};

    public final FrameLayout f41324c;
    public final qc0 d;

    public pc0(qc0 qc0Var, FrameLayout frameLayout) {
        this.d = qc0Var;
        this.f41324c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float fLerp = AndroidUtilities.lerp(this.f41323b, valueAnimator.getAnimatedFraction());
        if (fLerp >= 0.7f && !this.f41322a) {
            qc0 qc0Var = this.d;
            tc0 tc0Var = qc0Var.f41634b;
            tc0 tc0Var2 = qc0Var.f41634b;
            if (tc0Var.f42870k0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(tc0Var2.f42870k0, (Property<FrameLayout, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(tc0Var2.f42870k0, (Property<FrameLayout, Float>) View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(tc0Var2.f42870k0, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f41322a = true;
            }
        }
        if (fLerp <= 0.5f) {
            interpolation = org.telegram.ui.Components.er.f28123g.getInterpolation(fLerp / 0.5f) * 1.1f;
        } else {
            interpolation = fLerp <= 0.75f ? 1.1f - (org.telegram.ui.Components.er.f28123g.getInterpolation((fLerp - 0.5f) / 0.25f) * 0.2f) : (org.telegram.ui.Components.er.f28123g.getInterpolation((fLerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f41324c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
