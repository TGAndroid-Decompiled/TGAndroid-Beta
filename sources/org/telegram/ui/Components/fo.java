package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fo extends AnimatorListenerAdapter {
    public final int f24326a;
    public final go f24327b;

    public fo(go goVar, int i10) {
        this.f24326a = i10;
        this.f24327b = goVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f24326a) {
            case 0:
                this.f24327b.Q = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24326a) {
            case 0:
                go goVar = this.f24327b;
                if (goVar.Q == animator) {
                    goVar.getSubtitleTextView().setVisibility(4);
                    goVar.Q = null;
                    return;
                }
                return;
            default:
                this.f24327b.Q = null;
                return;
        }
    }
}
