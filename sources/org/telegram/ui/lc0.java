package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class lc0 implements ValueAnimator.AnimatorUpdateListener {
    public boolean f38795a;
    public final float[] f38796b = {0.0f, 1.0f};
    public final FrameLayout f38797c;
    public final mc0 d;

    public lc0(mc0 mc0Var, FrameLayout frameLayout) {
        this.d = mc0Var;
        this.f38797c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f38796b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f38795a) {
            mc0 mc0Var = this.d;
            pc0 pc0Var = mc0Var.f39077b;
            pc0 pc0Var2 = mc0Var.f39077b;
            if (pc0Var.f40035o0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(pc0Var2.f40035o0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(pc0Var2.f40035o0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(pc0Var2.f40035o0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f38795a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = org.telegram.ui.Components.bs.f25031g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (org.telegram.ui.Components.bs.f25031g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (org.telegram.ui.Components.bs.f25031g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f38797c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
