package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bo extends AnimatorListenerAdapter {
    public final int f24780a;
    public final co f24781b;

    public bo(co coVar, int i10) {
        this.f24780a = i10;
        this.f24781b = coVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f24780a) {
            case 0:
                this.f24781b.Q = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24780a) {
            case 0:
                co coVar = this.f24781b;
                if (coVar.Q == animator) {
                    coVar.getSubtitleTextView().setVisibility(4);
                    coVar.Q = null;
                    return;
                }
                return;
            default:
                this.f24781b.Q = null;
                return;
        }
    }
}
