package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class oo extends AnimatorListenerAdapter {
    public final int f31349a;
    public final po f31350b;

    public oo(po poVar, int i10) {
        this.f31349a = i10;
        this.f31350b = poVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31349a) {
            case 0:
                this.f31350b.Q = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31349a) {
            case 0:
                po poVar = this.f31350b;
                if (poVar.Q == animator) {
                    poVar.getSubtitleTextView().setVisibility(4);
                    poVar.Q = null;
                    return;
                }
                return;
            default:
                this.f31350b.Q = null;
                return;
        }
    }
}
