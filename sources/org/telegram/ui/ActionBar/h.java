package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
public final class h extends AnimatorListenerAdapter {
    public final int f20351a;
    public final TransitionValues f20352b;

    public h(TransitionValues transitionValues, int i10) {
        this.f20351a = i10;
        this.f20352b = transitionValues;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20351a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f20352b.view.setLayerType(0, null);
                return;
            default:
                super.onAnimationEnd(animator);
                this.f20352b.view.setEnabled(true);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f20351a) {
            case 0:
                super.onAnimationStart(animator);
                this.f20352b.view.setLayerType(2, null);
                return;
            default:
                super.onAnimationStart(animator);
                this.f20352b.view.setEnabled(false);
                return;
        }
    }
}
