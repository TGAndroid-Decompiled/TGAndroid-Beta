package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class fl implements ValueAnimator.AnimatorUpdateListener {
    public boolean f24309a;
    public final float[] f24310b = {0.0f, 1.0f};
    public final FrameLayout f24311c;
    public final gl d;

    public fl(gl glVar, FrameLayout frameLayout) {
        this.d = glVar;
        this.f24311c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f24310b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f24309a) {
            gl glVar = this.d;
            jl jlVar = glVar.f24592b;
            jl jlVar2 = glVar.f24592b;
            if (jlVar.f25492i0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(jlVar2.f25492i0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(jlVar2.f25492i0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(jlVar2.f25492i0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f24309a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = tr.f28637g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (tr.f28637g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (tr.f28637g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f24311c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
