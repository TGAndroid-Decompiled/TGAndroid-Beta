package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class el implements ValueAnimator.AnimatorUpdateListener {
    public boolean f24023a;
    public final float[] f24024b = {0.0f, 1.0f};
    public final FrameLayout f24025c;
    public final fl d;

    public el(fl flVar, FrameLayout frameLayout) {
        this.d = flVar;
        this.f24025c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f24024b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f24023a) {
            fl flVar = this.d;
            il ilVar = flVar.f24268b;
            il ilVar2 = flVar.f24268b;
            if (ilVar.f25155i0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(ilVar2.f25155i0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(ilVar2.f25155i0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(ilVar2.f25155i0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f24023a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = sr.f28350g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (sr.f28350g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (sr.f28350g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f24025c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
