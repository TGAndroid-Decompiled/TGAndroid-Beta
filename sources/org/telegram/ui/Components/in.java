package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class in extends AnimatorListenerAdapter {
    public final int f34706a;
    public final jn f34707b;

    public in(jn jnVar, int i7) {
        this.f34706a = i7;
        this.f34707b = jnVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f34706a) {
            case 0:
                this.f34707b.Q = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34706a) {
            case 0:
                jn jnVar = this.f34707b;
                if (jnVar.Q == animator) {
                    jnVar.getSubtitleTextView().setVisibility(4);
                    jnVar.Q = null;
                    return;
                }
                return;
            default:
                this.f34707b.Q = null;
                return;
        }
    }
}
