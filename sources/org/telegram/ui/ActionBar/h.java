package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
public final class h extends AnimatorListenerAdapter {
    public final int f27496a;
    public final TransitionValues f27497b;

    public h(TransitionValues transitionValues, int i7) {
        this.f27496a = i7;
        this.f27497b = transitionValues;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27496a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f27497b.view.setLayerType(0, null);
                return;
            default:
                super.onAnimationEnd(animator);
                this.f27497b.view.setEnabled(true);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f27496a) {
            case 0:
                super.onAnimationStart(animator);
                this.f27497b.view.setLayerType(2, null);
                return;
            default:
                super.onAnimationStart(animator);
                this.f27497b.view.setEnabled(false);
                return;
        }
    }
}
