package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class xk implements ValueAnimator.AnimatorUpdateListener {
    public boolean f34768a;
    public final float[] f34769b = {0.0f, 1.0f};
    public final FrameLayout f34770c;
    public final yk d;

    public xk(yk ykVar, FrameLayout frameLayout) {
        this.d = ykVar;
        this.f34770c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f34769b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f34768a) {
            yk ykVar = this.d;
            bl blVar = ykVar.f35086b;
            bl blVar2 = ykVar.f35086b;
            if (blVar.f27156e0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(blVar2.f27156e0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(blVar2.f27156e0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(blVar2.f27156e0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f34768a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = jr.f29801g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (jr.f29801g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (jr.f29801g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f34770c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
