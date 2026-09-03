package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class wk implements ValueAnimator.AnimatorUpdateListener {
    public boolean f30302a;
    public final float[] f30303b = {0.0f, 1.0f};
    public final FrameLayout f30304c;
    public final xk d;

    public wk(xk xkVar, FrameLayout frameLayout) {
        this.d = xkVar;
        this.f30304c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f30303b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f30302a) {
            xk xkVar = this.d;
            al alVar = xkVar.f30655b;
            al alVar2 = xkVar.f30655b;
            if (alVar.f23404f0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(alVar2.f23404f0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(alVar2.f23404f0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(alVar2.f23404f0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f30302a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = mr.f27123g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (mr.f27123g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (mr.f27123g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f30304c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
