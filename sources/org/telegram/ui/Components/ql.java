package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ql implements ValueAnimator.AnimatorUpdateListener {
    public boolean f28638a;
    public final float[] f28639b = {0.0f, 1.0f};
    public final FrameLayout f28640c;
    public final rl d;

    public ql(rl rlVar, FrameLayout frameLayout) {
        this.d = rlVar;
        this.f28640c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f28639b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f28638a) {
            rl rlVar = this.d;
            ul ulVar = rlVar.f28864b;
            ul ulVar2 = rlVar.f28864b;
            if (ulVar.f29714i0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(ulVar2.f29714i0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(ulVar2.f29714i0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(ulVar2.f29714i0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f28638a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = es.f24772g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (es.f24772g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (es.f24772g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f28640c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
