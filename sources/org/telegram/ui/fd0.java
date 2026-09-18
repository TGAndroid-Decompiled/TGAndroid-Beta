package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class fd0 implements ValueAnimator.AnimatorUpdateListener {
    public boolean f33512a;
    public final float[] f33513b = {0.0f, 1.0f};
    public final FrameLayout f33514c;
    public final gd0 d;

    public fd0(gd0 gd0Var, FrameLayout frameLayout) {
        this.d = gd0Var;
        this.f33514c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f33513b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f33512a) {
            gd0 gd0Var = this.d;
            jd0 jd0Var = gd0Var.f33815b;
            jd0 jd0Var2 = gd0Var.f33815b;
            if (jd0Var.f34829o0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(jd0Var2.f34829o0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(jd0Var2.f34829o0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(jd0Var2.f34829o0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f33512a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = org.telegram.ui.Components.qr.f27716g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (org.telegram.ui.Components.qr.f27716g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (org.telegram.ui.Components.qr.f27716g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f33514c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
