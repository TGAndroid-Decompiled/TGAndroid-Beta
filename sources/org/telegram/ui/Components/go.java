package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class go extends AnimatorListenerAdapter {
    public final int f26900a;
    public final ho f26901b;

    public go(ho hoVar, int i10) {
        this.f26900a = i10;
        this.f26901b = hoVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f26900a) {
            case 0:
                this.f26901b.Q = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26900a) {
            case 0:
                ho hoVar = this.f26901b;
                if (hoVar.Q == animator) {
                    hoVar.getSubtitleTextView().setVisibility(4);
                    hoVar.Q = null;
                    return;
                }
                return;
            default:
                this.f26901b.Q = null;
                return;
        }
    }
}
