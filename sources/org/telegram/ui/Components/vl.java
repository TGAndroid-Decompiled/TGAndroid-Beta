package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class vl implements ValueAnimator.AnimatorUpdateListener {
    public boolean f31549a;
    public final float[] f31550b = {0.0f, 1.0f};
    public final FrameLayout f31551c;
    public final wl d;

    public vl(wl wlVar, FrameLayout frameLayout) {
        this.d = wlVar;
        this.f31551c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f31550b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f31549a) {
            wl wlVar = this.d;
            zl zlVar = wlVar.f32434b;
            zl zlVar2 = wlVar.f32434b;
            if (zlVar.f33408i0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(zlVar2.f33408i0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(zlVar2.f33408i0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(zlVar2.f33408i0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f31549a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = js.f27635g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (js.f27635g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (js.f27635g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f31551c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
