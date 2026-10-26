package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ol implements ValueAnimator.AnimatorUpdateListener {
    public boolean f31323a;
    public final float[] f31324b = {0.0f, 1.0f};
    public final FrameLayout f31325c;
    public final pl d;

    public ol(pl plVar, FrameLayout frameLayout) {
        this.d = plVar;
        this.f31325c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f31324b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f31323a) {
            pl plVar = this.d;
            sl slVar = plVar.f31595b;
            sl slVar2 = plVar.f31595b;
            if (slVar.f32599g0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(slVar2.f32599g0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(slVar2.f32599g0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(slVar2.f32599g0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f31323a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = ds.f27587g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (ds.f27587g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (ds.f27587g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f31325c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
