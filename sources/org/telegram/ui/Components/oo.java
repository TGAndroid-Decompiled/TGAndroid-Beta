package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class oo extends AnimatorListenerAdapter {
    public final int f31334a;
    public final po f31335b;

    public oo(po poVar, int i10) {
        this.f31334a = i10;
        this.f31335b = poVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31334a) {
            case 0:
                this.f31335b.Q = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31334a) {
            case 0:
                po poVar = this.f31335b;
                if (poVar.Q == animator) {
                    poVar.getSubtitleTextView().setVisibility(4);
                    poVar.Q = null;
                    return;
                }
                return;
            default:
                this.f31335b.Q = null;
                return;
        }
    }
}
