package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bo extends AnimatorListenerAdapter {
    public final int f33846a;
    public final co f33847b;

    public bo(co coVar, int i7) {
        this.f33846a = i7;
        this.f33847b = coVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f33846a) {
            case 0:
                this.f33847b.R = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33846a) {
            case 0:
                co coVar = this.f33847b;
                if (coVar.R == animator) {
                    coVar.getSubtitleTextView().setVisibility(4);
                    coVar.R = null;
                    return;
                }
                return;
            default:
                this.f33847b.R = null;
                return;
        }
    }
}
