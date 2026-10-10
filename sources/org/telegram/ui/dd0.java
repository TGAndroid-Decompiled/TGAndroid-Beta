package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class dd0 implements ValueAnimator.AnimatorUpdateListener {
    public boolean f36976a;
    public final float[] f36977b = {0.0f, 1.0f};
    public final FrameLayout f36978c;
    public final ed0 d;

    public dd0(ed0 ed0Var, FrameLayout frameLayout) {
        this.d = ed0Var;
        this.f36978c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f36977b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f36976a) {
            ed0 ed0Var = this.d;
            hd0 hd0Var = ed0Var.f37278b;
            hd0 hd0Var2 = ed0Var.f37278b;
            if (hd0Var.f38318o0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(hd0Var2.f38318o0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(hd0Var2.f38318o0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(hd0Var2.f38318o0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f36976a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = org.telegram.ui.Components.is.f27444g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (org.telegram.ui.Components.is.f27444g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (org.telegram.ui.Components.is.f27444g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f36978c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
