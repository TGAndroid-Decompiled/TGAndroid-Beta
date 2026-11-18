package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
public final class h extends AnimatorListenerAdapter {
    public final int f28980a;
    public final TransitionValues f28981b;

    public h(TransitionValues transitionValues, int i7) {
        this.f28980a = i7;
        this.f28981b = transitionValues;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28980a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f28981b.view.setLayerType(0, null);
                return;
            default:
                super.onAnimationEnd(animator);
                this.f28981b.view.setEnabled(true);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f28980a) {
            case 0:
                super.onAnimationStart(animator);
                this.f28981b.view.setLayerType(2, null);
                return;
            default:
                super.onAnimationStart(animator);
                this.f28981b.view.setEnabled(false);
                return;
        }
    }
}
