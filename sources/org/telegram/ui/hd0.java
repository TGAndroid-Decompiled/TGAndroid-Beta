package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class hd0 implements ValueAnimator.AnimatorUpdateListener {
    public boolean f36522a;
    public final float[] f36523b = {0.0f, 1.0f};
    public final FrameLayout f36524c;
    public final id0 d;

    public hd0(id0 id0Var, FrameLayout frameLayout) {
        this.d = id0Var;
        this.f36524c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f36523b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f36522a) {
            id0 id0Var = this.d;
            ld0 ld0Var = id0Var.f36787b;
            ld0 ld0Var2 = id0Var.f36787b;
            if (ld0Var.f37701o0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(ld0Var2.f37701o0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(ld0Var2.f37701o0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(ld0Var2.f37701o0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f36522a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = org.telegram.ui.Components.es.f24466g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (org.telegram.ui.Components.es.f24466g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (org.telegram.ui.Components.es.f24466g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f36524c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
