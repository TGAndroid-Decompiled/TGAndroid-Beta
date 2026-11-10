package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
public final class i extends AnimatorListenerAdapter {
    public final int f27524a;
    public final TransitionValues f27525b;

    public i(TransitionValues transitionValues, int i7) {
        this.f27524a = i7;
        this.f27525b = transitionValues;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27524a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f27525b.view.setLayerType(0, null);
                return;
            default:
                super.onAnimationEnd(animator);
                this.f27525b.view.setEnabled(true);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f27524a) {
            case 0:
                super.onAnimationStart(animator);
                this.f27525b.view.setLayerType(2, null);
                return;
            default:
                super.onAnimationStart(animator);
                this.f27525b.view.setEnabled(false);
                return;
        }
    }
}
