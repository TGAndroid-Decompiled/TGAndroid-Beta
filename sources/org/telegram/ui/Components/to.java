package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class to extends AnimatorListenerAdapter {
    public final int f31124a;
    public final uo f31125b;

    public to(uo uoVar, int i10) {
        this.f31124a = i10;
        this.f31125b = uoVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31124a) {
            case 0:
                this.f31125b.Q = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31124a) {
            case 0:
                uo uoVar = this.f31125b;
                if (uoVar.Q == animator) {
                    uoVar.getSubtitleTextView().setVisibility(4);
                    uoVar.Q = null;
                    return;
                }
                return;
            default:
                this.f31125b.Q = null;
                return;
        }
    }
}
