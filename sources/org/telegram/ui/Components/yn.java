package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yn extends AnimatorListenerAdapter {
    public final int f42522a;
    public final zn f42523b;

    public yn(zn znVar, int i7) {
        this.f42522a = i7;
        this.f42523b = znVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f42522a) {
            case 0:
                this.f42523b.R = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42522a) {
            case 0:
                zn znVar = this.f42523b;
                if (znVar.R == animator) {
                    znVar.getSubtitleTextView().setVisibility(4);
                    znVar.R = null;
                    return;
                }
                return;
            default:
                this.f42523b.R = null;
                return;
        }
    }
}
