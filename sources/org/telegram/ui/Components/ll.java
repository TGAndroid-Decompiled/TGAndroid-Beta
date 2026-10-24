package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ll implements ValueAnimator.AnimatorUpdateListener {
    public boolean f28364a;
    public final float[] f28365b = {0.0f, 1.0f};
    public final FrameLayout f28366c;
    public final ml d;

    public ll(ml mlVar, FrameLayout frameLayout) {
        this.d = mlVar;
        this.f28366c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f28365b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f28364a) {
            ml mlVar = this.d;
            pl plVar = mlVar.f28621b;
            pl plVar2 = mlVar.f28621b;
            if (plVar.f29594g0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(plVar2.f29594g0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(plVar2.f29594g0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(plVar2.f29594g0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f28364a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = zr.f33338g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (zr.f33338g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (zr.f33338g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f28366c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
