package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class yk implements ValueAnimator.AnimatorUpdateListener {
    public boolean f33551a;
    public final float[] f33552b = {0.0f, 1.0f};
    public final FrameLayout f33553c;
    public final zk d;

    public yk(zk zkVar, FrameLayout frameLayout) {
        this.d = zkVar;
        this.f33553c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f33552b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f33551a) {
            zk zkVar = this.d;
            cl clVar = zkVar.f33961b;
            cl clVar2 = zkVar.f33961b;
            if (clVar.f25978f0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(clVar2.f25978f0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(clVar2.f25978f0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(clVar2.f25978f0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f33551a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = pr.f30169g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (pr.f30169g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (pr.f30169g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f33553c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
