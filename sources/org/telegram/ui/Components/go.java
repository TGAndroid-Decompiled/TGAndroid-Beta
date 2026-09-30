package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class go extends AnimatorListenerAdapter {
    public final int f24651a;
    public final ho f24652b;

    public go(ho hoVar, int i10) {
        this.f24651a = i10;
        this.f24652b = hoVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f24651a) {
            case 0:
                this.f24652b.Q = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24651a) {
            case 0:
                ho hoVar = this.f24652b;
                if (hoVar.Q == animator) {
                    hoVar.getSubtitleTextView().setVisibility(4);
                    hoVar.Q = null;
                    return;
                }
                return;
            default:
                this.f24652b.Q = null;
                return;
        }
    }
}
