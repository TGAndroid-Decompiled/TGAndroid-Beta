package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class nl implements ValueAnimator.AnimatorUpdateListener {
    public boolean f28982a;
    public final float[] f28983b = {0.0f, 1.0f};
    public final FrameLayout f28984c;
    public final ol d;

    public nl(ol olVar, FrameLayout frameLayout) {
        this.d = olVar;
        this.f28984c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f28983b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f28982a) {
            ol olVar = this.d;
            rl rlVar = olVar.f29228b;
            rl rlVar2 = olVar.f29228b;
            if (rlVar.f30196g0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(rlVar2.f30196g0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(rlVar2.f30196g0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(rlVar2.f30196g0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f28982a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = bs.f25134g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (bs.f25134g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (bs.f25134g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f28984c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
