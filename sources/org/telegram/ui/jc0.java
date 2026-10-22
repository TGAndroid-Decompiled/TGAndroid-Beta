package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class jc0 implements ValueAnimator.AnimatorUpdateListener {
    public boolean f38233a;
    public final float[] f38234b = {0.0f, 1.0f};
    public final FrameLayout f38235c;
    public final kc0 d;

    public jc0(kc0 kc0Var, FrameLayout frameLayout) {
        this.d = kc0Var;
        this.f38235c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f38234b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f38233a) {
            kc0 kc0Var = this.d;
            nc0 nc0Var = kc0Var.f38519b;
            nc0 nc0Var2 = kc0Var.f38519b;
            if (nc0Var.f39519o0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(nc0Var2.f39519o0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(nc0Var2.f39519o0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(nc0Var2.f39519o0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f38233a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = org.telegram.ui.Components.bs.f25025g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (org.telegram.ui.Components.bs.f25025g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (org.telegram.ui.Components.bs.f25025g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f38235c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
