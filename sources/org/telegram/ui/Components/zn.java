package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zn extends AnimatorListenerAdapter {
    public final int f42912a;
    public final ao f42913b;

    public zn(ao aoVar, int i7) {
        this.f42912a = i7;
        this.f42913b = aoVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f42912a) {
            case 0:
                this.f42913b.R = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42912a) {
            case 0:
                ao aoVar = this.f42913b;
                if (aoVar.R == animator) {
                    aoVar.getSubtitleTextView().setVisibility(4);
                    aoVar.R = null;
                    return;
                }
                return;
            default:
                this.f42913b.R = null;
                return;
        }
    }
}
