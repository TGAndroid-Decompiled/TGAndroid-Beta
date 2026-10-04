package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class cd0 implements ValueAnimator.AnimatorUpdateListener {
    public boolean f35444a;
    public final float[] f35445b = {0.0f, 1.0f};
    public final FrameLayout f35446c;
    public final dd0 d;

    public cd0(dd0 dd0Var, FrameLayout frameLayout) {
        this.d = dd0Var;
        this.f35446c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f35445b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f35444a) {
            dd0 dd0Var = this.d;
            gd0 gd0Var = dd0Var.f35747b;
            gd0 gd0Var2 = dd0Var.f35747b;
            if (gd0Var.f36581o0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(gd0Var2.f36581o0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(gd0Var2.f36581o0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(gd0Var2.f36581o0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f35444a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = org.telegram.ui.Components.tr.f31142g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (org.telegram.ui.Components.tr.f31142g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (org.telegram.ui.Components.tr.f31142g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f35446c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
