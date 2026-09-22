package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ed0 implements ValueAnimator.AnimatorUpdateListener {
    public boolean f33267a;
    public final float[] f33268b = {0.0f, 1.0f};
    public final FrameLayout f33269c;
    public final fd0 d;

    public ed0(fd0 fd0Var, FrameLayout frameLayout) {
        this.d = fd0Var;
        this.f33269c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f33268b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f33267a) {
            fd0 fd0Var = this.d;
            id0 id0Var = fd0Var.f33571b;
            id0 id0Var2 = fd0Var.f33571b;
            if (id0Var.f34624o0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(id0Var2.f34624o0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(id0Var2.f34624o0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(id0Var2.f34624o0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f33267a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = org.telegram.ui.Components.qr.f27421g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (org.telegram.ui.Components.qr.f27421g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (org.telegram.ui.Components.qr.f27421g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f33269c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
