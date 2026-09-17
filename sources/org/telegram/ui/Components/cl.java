package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class cl implements ValueAnimator.AnimatorUpdateListener {
    public boolean f25053a;
    public final float[] f25054b = {0.0f, 1.0f};
    public final FrameLayout f25055c;
    public final dl d;

    public cl(dl dlVar, FrameLayout frameLayout) {
        this.d = dlVar;
        this.f25055c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f25054b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f25053a) {
            dl dlVar = this.d;
            gl glVar = dlVar.f25447b;
            gl glVar2 = dlVar.f25447b;
            if (glVar.f26464i0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(glVar2.f26464i0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(glVar2.f26464i0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(glVar2.f26464i0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f25053a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = pr.f29495g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (pr.f29495g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (pr.f29495g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f25055c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
