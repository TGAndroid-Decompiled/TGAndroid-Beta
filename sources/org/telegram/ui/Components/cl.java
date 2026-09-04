package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class cl implements ValueAnimator.AnimatorUpdateListener {
    public boolean f25025a;
    public final float[] f25026b = {0.0f, 1.0f};
    public final FrameLayout f25027c;
    public final dl d;

    public cl(dl dlVar, FrameLayout frameLayout) {
        this.d = dlVar;
        this.f25027c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f25026b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f25025a) {
            dl dlVar = this.d;
            gl glVar = dlVar.f25419b;
            gl glVar2 = dlVar.f25419b;
            if (glVar.f26436i0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(glVar2.f26436i0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(glVar2.f26436i0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(glVar2.f26436i0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f25025a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = pr.f29467g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (pr.f29467g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (pr.f29467g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f25027c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
