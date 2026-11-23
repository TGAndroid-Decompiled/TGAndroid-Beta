package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bo extends AnimatorListenerAdapter {
    public final int f33885a;
    public final co f33886b;

    public bo(co coVar, int i7) {
        this.f33885a = i7;
        this.f33886b = coVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f33885a) {
            case 0:
                this.f33886b.R = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33885a) {
            case 0:
                co coVar = this.f33886b;
                if (coVar.R == animator) {
                    coVar.getSubtitleTextView().setVisibility(4);
                    coVar.R = null;
                    return;
                }
                return;
            default:
                this.f33886b.R = null;
                return;
        }
    }
}
