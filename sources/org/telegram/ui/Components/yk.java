package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class yk implements ValueAnimator.AnimatorUpdateListener {
    public boolean f33530a;
    public final float[] f33531b = {0.0f, 1.0f};
    public final FrameLayout f33532c;
    public final zk d;

    public yk(zk zkVar, FrameLayout frameLayout) {
        this.d = zkVar;
        this.f33532c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f33531b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f33530a) {
            zk zkVar = this.d;
            cl clVar = zkVar.f33907b;
            cl clVar2 = zkVar.f33907b;
            if (clVar.f26001f0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(clVar2.f26001f0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(clVar2.f26001f0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(clVar2.f26001f0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f33530a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = pr.f30184g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (pr.f30184g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (pr.f30184g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f33532c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
