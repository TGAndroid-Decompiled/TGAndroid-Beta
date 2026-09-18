package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class gd0 implements ValueAnimator.AnimatorUpdateListener {
    public boolean f33953a;
    public final float[] f33954b = {0.0f, 1.0f};
    public final FrameLayout f33955c;
    public final hd0 d;

    public gd0(hd0 hd0Var, FrameLayout frameLayout) {
        this.d = hd0Var;
        this.f33955c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f33954b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f33953a) {
            hd0 hd0Var = this.d;
            kd0 kd0Var = hd0Var.f34244b;
            kd0 kd0Var2 = hd0Var.f34244b;
            if (kd0Var.f35237o0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(kd0Var2.f35237o0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(kd0Var2.f35237o0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(kd0Var2.f35237o0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f33953a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = org.telegram.ui.Components.qr.f27384g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (org.telegram.ui.Components.qr.f27384g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (org.telegram.ui.Components.qr.f27384g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f33955c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
