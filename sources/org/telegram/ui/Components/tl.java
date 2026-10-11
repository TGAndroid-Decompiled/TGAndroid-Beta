package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class tl implements ValueAnimator.AnimatorUpdateListener {
    public boolean f31289a;
    public final float[] f31290b = {0.0f, 1.0f};
    public final FrameLayout f31291c;
    public final ul d;

    public tl(ul ulVar, FrameLayout frameLayout) {
        this.d = ulVar;
        this.f31291c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f31290b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f31289a) {
            ul ulVar = this.d;
            xl xlVar = ulVar.f31628b;
            xl xlVar2 = ulVar.f31628b;
            if (xlVar.f33004i0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(xlVar2.f33004i0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(xlVar2.f33004i0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(xlVar2.f33004i0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f31289a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = is.f27501g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (is.f27501g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (is.f27501g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f31291c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
