package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class cl implements ValueAnimator.AnimatorUpdateListener {
    public boolean f23319a;
    public final float[] f23320b = {0.0f, 1.0f};
    public final FrameLayout f23321c;
    public final dl d;

    public cl(dl dlVar, FrameLayout frameLayout) {
        this.d = dlVar;
        this.f23321c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f23320b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f23319a) {
            dl dlVar = this.d;
            gl glVar = dlVar.f23606b;
            gl glVar2 = dlVar.f23606b;
            if (glVar.f24392i0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(glVar2.f24392i0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(glVar2.f24392i0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(glVar2.f24392i0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f23319a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = qr.f27643g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (qr.f27643g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (qr.f27643g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f23321c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
