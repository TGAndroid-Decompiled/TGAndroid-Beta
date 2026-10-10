package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class to extends AnimatorListenerAdapter {
    public final int f31191a;
    public final uo f31192b;

    public to(uo uoVar, int i10) {
        this.f31191a = i10;
        this.f31192b = uoVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31191a) {
            case 0:
                this.f31192b.Q = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31191a) {
            case 0:
                uo uoVar = this.f31192b;
                if (uoVar.Q == animator) {
                    uoVar.getSubtitleTextView().setVisibility(4);
                    uoVar.Q = null;
                    return;
                }
                return;
            default:
                this.f31192b.Q = null;
                return;
        }
    }
}
