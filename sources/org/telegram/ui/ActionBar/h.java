package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
public final class h extends AnimatorListenerAdapter {
    public final int f27548a;
    public final TransitionValues f27549b;

    public h(TransitionValues transitionValues, int i3) {
        this.f27548a = i3;
        this.f27549b = transitionValues;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27548a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f27549b.view.setLayerType(0, null);
                return;
            default:
                super.onAnimationEnd(animator);
                this.f27549b.view.setEnabled(true);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f27548a) {
            case 0:
                super.onAnimationStart(animator);
                this.f27549b.view.setLayerType(2, null);
                return;
            default:
                super.onAnimationStart(animator);
                this.f27549b.view.setEnabled(false);
                return;
        }
    }
}
