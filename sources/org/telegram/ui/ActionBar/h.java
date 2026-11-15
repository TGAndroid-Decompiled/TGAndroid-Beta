package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
public final class h extends AnimatorListenerAdapter {
    public final int f28625a;
    public final TransitionValues f28626b;

    public h(TransitionValues transitionValues, int i7) {
        this.f28625a = i7;
        this.f28626b = transitionValues;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28625a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f28626b.view.setLayerType(0, null);
                return;
            default:
                super.onAnimationEnd(animator);
                this.f28626b.view.setEnabled(true);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f28625a) {
            case 0:
                super.onAnimationStart(animator);
                this.f28626b.view.setLayerType(2, null);
                return;
            default:
                super.onAnimationStart(animator);
                this.f28626b.view.setEnabled(false);
                return;
        }
    }
}
