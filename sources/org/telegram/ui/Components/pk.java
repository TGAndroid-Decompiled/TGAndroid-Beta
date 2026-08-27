package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class pk implements ValueAnimator.AnimatorUpdateListener {

    public boolean f31623a;

    public final float[] f31624b = {0.0f, 1.0f};

    public final FrameLayout f31625c;
    public final qk d;

    public pk(qk qkVar, FrameLayout frameLayout) {
        this.d = qkVar;
        this.f31625c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float fLerp = AndroidUtilities.lerp(this.f31624b, valueAnimator.getAnimatedFraction());
        if (fLerp >= 0.7f && !this.f31623a) {
            qk qkVar = this.d;
            tk tkVar = qkVar.f31920b;
            tk tkVar2 = qkVar.f31920b;
            if (tkVar.f32802e0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(tkVar2.f32802e0, (Property<FrameLayout, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(tkVar2.f32802e0, (Property<FrameLayout, Float>) View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(tkVar2.f32802e0, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f31623a = true;
            }
        }
        if (fLerp <= 0.5f) {
            interpolation = er.f28123g.getInterpolation(fLerp / 0.5f) * 1.1f;
        } else {
            interpolation = fLerp <= 0.75f ? 1.1f - (er.f28123g.getInterpolation((fLerp - 0.5f) / 0.25f) * 0.2f) : (er.f28123g.getInterpolation((fLerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f31625c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
