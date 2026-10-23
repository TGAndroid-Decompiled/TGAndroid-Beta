package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class no extends AnimatorListenerAdapter {
    public final int f28860a;
    public final oo f28861b;

    public no(oo ooVar, int i10) {
        this.f28860a = i10;
        this.f28861b = ooVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28860a) {
            case 0:
                this.f28861b.Q = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28860a) {
            case 0:
                oo ooVar = this.f28861b;
                if (ooVar.Q == animator) {
                    ooVar.getSubtitleTextView().setVisibility(4);
                    ooVar.Q = null;
                    return;
                }
                return;
            default:
                this.f28861b.Q = null;
                return;
        }
    }
}
