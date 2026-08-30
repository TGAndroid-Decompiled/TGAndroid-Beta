package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class wk implements ValueAnimator.AnimatorUpdateListener {
    public boolean f30379a;
    public final float[] f30380b = {0.0f, 1.0f};
    public final FrameLayout f30381c;
    public final xk d;

    public wk(xk xkVar, FrameLayout frameLayout) {
        this.d = xkVar;
        this.f30381c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f30380b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f30379a) {
            xk xkVar = this.d;
            al alVar = xkVar.f30687b;
            al alVar2 = xkVar.f30687b;
            if (alVar.f23423f0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(alVar2.f23423f0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(alVar2.f23423f0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(alVar2.f23423f0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f30379a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = nr.f27347g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (nr.f27347g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (nr.f27347g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f30381c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
