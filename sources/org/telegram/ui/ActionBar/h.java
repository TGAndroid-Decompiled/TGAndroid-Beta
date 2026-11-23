package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
public final class h extends AnimatorListenerAdapter {
    public final int f29047a;
    public final TransitionValues f29048b;

    public h(TransitionValues transitionValues, int i7) {
        this.f29047a = i7;
        this.f29048b = transitionValues;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29047a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f29048b.view.setLayerType(0, null);
                return;
            default:
                super.onAnimationEnd(animator);
                this.f29048b.view.setEnabled(true);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f29047a) {
            case 0:
                super.onAnimationStart(animator);
                this.f29048b.view.setLayerType(2, null);
                return;
            default:
                super.onAnimationStart(animator);
                this.f29048b.view.setEnabled(false);
                return;
        }
    }
}
