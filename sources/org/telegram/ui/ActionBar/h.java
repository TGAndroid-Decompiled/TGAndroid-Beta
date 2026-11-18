package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
public final class h extends AnimatorListenerAdapter {
    public final int f28982a;
    public final TransitionValues f28983b;

    public h(TransitionValues transitionValues, int i7) {
        this.f28982a = i7;
        this.f28983b = transitionValues;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28982a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f28983b.view.setLayerType(0, null);
                return;
            default:
                super.onAnimationEnd(animator);
                this.f28983b.view.setEnabled(true);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f28982a) {
            case 0:
                super.onAnimationStart(animator);
                this.f28983b.view.setLayerType(2, null);
                return;
            default:
                super.onAnimationStart(animator);
                this.f28983b.view.setEnabled(false);
                return;
        }
    }
}
