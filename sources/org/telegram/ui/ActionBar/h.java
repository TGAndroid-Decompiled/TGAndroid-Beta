package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
public final class h extends AnimatorListenerAdapter {
    public final int f20350a;
    public final TransitionValues f20351b;

    public h(TransitionValues transitionValues, int i10) {
        this.f20350a = i10;
        this.f20351b = transitionValues;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20350a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f20351b.view.setLayerType(0, null);
                return;
            default:
                super.onAnimationEnd(animator);
                this.f20351b.view.setEnabled(true);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f20350a) {
            case 0:
                super.onAnimationStart(animator);
                this.f20351b.view.setLayerType(2, null);
                return;
            default:
                super.onAnimationStart(animator);
                this.f20351b.view.setEnabled(false);
                return;
        }
    }
}
