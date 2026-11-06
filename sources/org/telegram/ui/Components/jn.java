package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jn extends AnimatorListenerAdapter {
    public final int f34996a;
    public final kn f34997b;

    public jn(kn knVar, int i7) {
        this.f34996a = i7;
        this.f34997b = knVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f34996a) {
            case 0:
                this.f34997b.Q = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34996a) {
            case 0:
                kn knVar = this.f34997b;
                if (knVar.Q == animator) {
                    knVar.getSubtitleTextView().setVisibility(4);
                    knVar.Q = null;
                    return;
                }
                return;
            default:
                this.f34997b.Q = null;
                return;
        }
    }
}
