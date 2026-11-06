package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jn extends AnimatorListenerAdapter {
    public final int f35022a;
    public final kn f35023b;

    public jn(kn knVar, int i7) {
        this.f35022a = i7;
        this.f35023b = knVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f35022a) {
            case 0:
                this.f35023b.Q = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35022a) {
            case 0:
                kn knVar = this.f35023b;
                if (knVar.Q == animator) {
                    knVar.getSubtitleTextView().setVisibility(4);
                    knVar.Q = null;
                    return;
                }
                return;
            default:
                this.f35023b.Q = null;
                return;
        }
    }
}
