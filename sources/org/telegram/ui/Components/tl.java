package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class tl implements ValueAnimator.AnimatorUpdateListener {
    public boolean f31220a;
    public final float[] f31221b = {0.0f, 1.0f};
    public final FrameLayout f31222c;
    public final ul d;

    public tl(ul ulVar, FrameLayout frameLayout) {
        this.d = ulVar;
        this.f31222c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f31221b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f31220a) {
            ul ulVar = this.d;
            xl xlVar = ulVar.f31533b;
            xl xlVar2 = ulVar.f31533b;
            if (xlVar.f32912i0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(xlVar2.f32912i0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(xlVar2.f32912i0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(xlVar2.f32912i0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f31220a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = hs.f27119g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (hs.f27119g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (hs.f27119g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f31222c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
