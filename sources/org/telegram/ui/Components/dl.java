package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class dl implements ValueAnimator.AnimatorUpdateListener {
    public boolean f23628a;
    public final float[] f23629b = {0.0f, 1.0f};
    public final FrameLayout f23630c;
    public final el d;

    public dl(el elVar, FrameLayout frameLayout) {
        this.d = elVar;
        this.f23630c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f23629b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f23628a) {
            el elVar = this.d;
            hl hlVar = elVar.f23954b;
            hl hlVar2 = elVar.f23954b;
            if (hlVar.f24779i0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(hlVar2.f24779i0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(hlVar2.f24779i0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(hlVar2.f24779i0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f23628a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = rr.f28023g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (rr.f28023g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (rr.f28023g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f23630c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
