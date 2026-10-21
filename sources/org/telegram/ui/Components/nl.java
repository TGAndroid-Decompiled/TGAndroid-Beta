package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class nl implements ValueAnimator.AnimatorUpdateListener {
    public boolean f28838a;
    public final float[] f28839b = {0.0f, 1.0f};
    public final FrameLayout f28840c;
    public final ol d;

    public nl(ol olVar, FrameLayout frameLayout) {
        this.d = olVar;
        this.f28840c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f28839b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f28838a) {
            ol olVar = this.d;
            rl rlVar = olVar.f29064b;
            rl rlVar2 = olVar.f29064b;
            if (rlVar.f29955i0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(rlVar2.f29955i0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(rlVar2.f29955i0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(rlVar2.f29955i0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f28838a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = bs.f25022g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (bs.f25022g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (bs.f25022g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f28840c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
