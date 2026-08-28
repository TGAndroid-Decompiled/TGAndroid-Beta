package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class tk implements ValueAnimator.AnimatorUpdateListener {
    public boolean f32712a;
    public final float[] f32713b = {0.0f, 1.0f};
    public final FrameLayout f32714c;
    public final uk d;

    public tk(uk ukVar, FrameLayout frameLayout) {
        this.d = ukVar;
        this.f32714c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f32713b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f32712a) {
            uk ukVar = this.d;
            xk xkVar = ukVar.f33085b;
            xk xkVar2 = ukVar.f33085b;
            if (xkVar.f34692e0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(xkVar2.f34692e0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(xkVar2.f34692e0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(xkVar2.f34692e0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f32712a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = gr.f28845g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (gr.f28845g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (gr.f28845g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f32714c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
