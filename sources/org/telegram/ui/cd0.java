package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class cd0 implements ValueAnimator.AnimatorUpdateListener {
    public boolean f35443a;
    public final float[] f35444b = {0.0f, 1.0f};
    public final FrameLayout f35445c;
    public final dd0 d;

    public cd0(dd0 dd0Var, FrameLayout frameLayout) {
        this.d = dd0Var;
        this.f35445c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f35444b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f35443a) {
            dd0 dd0Var = this.d;
            gd0 gd0Var = dd0Var.f35746b;
            gd0 gd0Var2 = dd0Var.f35746b;
            if (gd0Var.f36580o0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(gd0Var2.f36580o0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(gd0Var2.f36580o0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(gd0Var2.f36580o0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f35443a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = org.telegram.ui.Components.tr.f31141g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (org.telegram.ui.Components.tr.f31141g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (org.telegram.ui.Components.tr.f31141g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f35445c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
