package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class nc0 implements ValueAnimator.AnimatorUpdateListener {
    public boolean f39799a;
    public final float[] f39800b = {0.0f, 1.0f};
    public final FrameLayout f39801c;
    public final oc0 d;

    public nc0(oc0 oc0Var, FrameLayout frameLayout) {
        this.d = oc0Var;
        this.f39801c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f39800b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f39799a) {
            oc0 oc0Var = this.d;
            rc0 rc0Var = oc0Var.f40160b;
            rc0 rc0Var2 = oc0Var.f40160b;
            if (rc0Var.f41110o0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(rc0Var2.f41110o0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(rc0Var2.f41110o0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(rc0Var2.f41110o0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f39799a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = org.telegram.ui.Components.zr.f33338g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (org.telegram.ui.Components.zr.f33338g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (org.telegram.ui.Components.zr.f33338g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f39801c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
