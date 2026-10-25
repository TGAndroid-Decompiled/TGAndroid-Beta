package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class lc0 implements ValueAnimator.AnimatorUpdateListener {
    public boolean f41244a;
    public final float[] f41245b = {0.0f, 1.0f};
    public final FrameLayout f41246c;
    public final mc0 d;

    public lc0(mc0 mc0Var, FrameLayout frameLayout) {
        this.d = mc0Var;
        this.f41246c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f41245b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f41244a) {
            mc0 mc0Var = this.d;
            pc0 pc0Var = mc0Var.f41529b;
            pc0 pc0Var2 = mc0Var.f41529b;
            if (pc0Var.f42443o0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(pc0Var2.f42443o0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(pc0Var2.f42443o0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(pc0Var2.f42443o0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f41244a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = org.telegram.ui.Components.ds.f27585g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (org.telegram.ui.Components.ds.f27585g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (org.telegram.ui.Components.ds.f27585g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f41246c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
