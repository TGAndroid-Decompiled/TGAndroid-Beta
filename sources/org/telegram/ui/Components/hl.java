package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class hl implements ValueAnimator.AnimatorUpdateListener {
    public boolean f23682a;
    public final float[] f23683b = {0.0f, 1.0f};
    public final FrameLayout f23684c;
    public final il d;

    public hl(il ilVar, FrameLayout frameLayout) {
        this.d = ilVar;
        this.f23684c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f23683b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f23682a) {
            il ilVar = this.d;
            ll llVar = ilVar.f24042b;
            ll llVar2 = ilVar.f24042b;
            if (llVar.f25032i0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(llVar2.f25032i0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(llVar2.f25032i0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(llVar2.f25032i0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f23682a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = wr.f28820g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (wr.f28820g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (wr.f28820g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f23684c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
