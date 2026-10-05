package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class fl implements ValueAnimator.AnimatorUpdateListener {
    public boolean f26497a;
    public final float[] f26498b = {0.0f, 1.0f};
    public final FrameLayout f26499c;
    public final gl d;

    public fl(gl glVar, FrameLayout frameLayout) {
        this.d = glVar;
        this.f26499c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f26498b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f26497a) {
            gl glVar = this.d;
            jl jlVar = glVar.f26938b;
            jl jlVar2 = glVar.f26938b;
            if (jlVar.f27884i0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(jlVar2.f27884i0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(jlVar2.f27884i0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(jlVar2.f27884i0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f26497a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = tr.f31216g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (tr.f31216g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (tr.f31216g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f26499c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
