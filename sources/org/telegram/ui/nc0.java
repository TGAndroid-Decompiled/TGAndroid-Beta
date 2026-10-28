package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class nc0 implements ValueAnimator.AnimatorUpdateListener {
    public boolean f41739a;
    public final float[] f41740b = {0.0f, 1.0f};
    public final FrameLayout f41741c;
    public final oc0 d;

    public nc0(oc0 oc0Var, FrameLayout frameLayout) {
        this.d = oc0Var;
        this.f41741c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f41740b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f41739a) {
            oc0 oc0Var = this.d;
            rc0 rc0Var = oc0Var.f42062b;
            rc0 rc0Var2 = oc0Var.f42062b;
            if (rc0Var.f42939o0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(rc0Var2.f42939o0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(rc0Var2.f42939o0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(rc0Var2.f42939o0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f41739a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = org.telegram.ui.Components.ds.f27531g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (org.telegram.ui.Components.ds.f27531g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (org.telegram.ui.Components.ds.f27531g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f41741c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
