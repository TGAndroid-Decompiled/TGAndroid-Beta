package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class jc0 implements ValueAnimator.AnimatorUpdateListener {
    public boolean f38230a;
    public final float[] f38231b = {0.0f, 1.0f};
    public final FrameLayout f38232c;
    public final kc0 d;

    public jc0(kc0 kc0Var, FrameLayout frameLayout) {
        this.d = kc0Var;
        this.f38232c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f38231b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f38230a) {
            kc0 kc0Var = this.d;
            nc0 nc0Var = kc0Var.f38516b;
            nc0 nc0Var2 = kc0Var.f38516b;
            if (nc0Var.f39516o0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(nc0Var2.f39516o0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(nc0Var2.f39516o0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(nc0Var2.f39516o0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f38230a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = org.telegram.ui.Components.bs.f25022g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (org.telegram.ui.Components.bs.f25022g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (org.telegram.ui.Components.bs.f25022g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f38232c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
