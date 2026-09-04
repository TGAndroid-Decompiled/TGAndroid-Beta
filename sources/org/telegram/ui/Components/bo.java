package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bo extends AnimatorListenerAdapter {
    public final int f24752a;
    public final co f24753b;

    public bo(co coVar, int i10) {
        this.f24752a = i10;
        this.f24753b = coVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f24752a) {
            case 0:
                this.f24753b.Q = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24752a) {
            case 0:
                co coVar = this.f24753b;
                if (coVar.Q == animator) {
                    coVar.getSubtitleTextView().setVisibility(4);
                    coVar.Q = null;
                    return;
                }
                return;
            default:
                this.f24753b.Q = null;
                return;
        }
    }
}
