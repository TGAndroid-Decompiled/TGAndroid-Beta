package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class to extends AnimatorListenerAdapter {
    public final int f31259a;
    public final uo f31260b;

    public to(uo uoVar, int i10) {
        this.f31259a = i10;
        this.f31260b = uoVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31259a) {
            case 0:
                this.f31260b.Q = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31259a) {
            case 0:
                uo uoVar = this.f31260b;
                if (uoVar.Q == animator) {
                    uoVar.getSubtitleTextView().setVisibility(4);
                    uoVar.Q = null;
                    return;
                }
                return;
            default:
                this.f31260b.Q = null;
                return;
        }
    }
}
