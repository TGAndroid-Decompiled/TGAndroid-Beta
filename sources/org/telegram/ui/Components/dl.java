package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class dl implements ValueAnimator.AnimatorUpdateListener {
    public boolean f23648a;
    public final float[] f23649b = {0.0f, 1.0f};
    public final FrameLayout f23650c;
    public final el d;

    public dl(el elVar, FrameLayout frameLayout) {
        this.d = elVar;
        this.f23650c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f23649b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f23648a) {
            el elVar = this.d;
            hl hlVar = elVar.f23971b;
            hl hlVar2 = elVar.f23971b;
            if (hlVar.f24806i0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(hlVar2.f24806i0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(hlVar2.f24806i0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(hlVar2.f24806i0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f23648a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = rr.f28032g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (rr.f28032g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (rr.f28032g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f23650c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
