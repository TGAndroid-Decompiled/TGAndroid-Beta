package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fo extends AnimatorListenerAdapter {
    public final int f24300a;
    public final go f24301b;

    public fo(go goVar, int i10) {
        this.f24300a = i10;
        this.f24301b = goVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f24300a) {
            case 0:
                this.f24301b.Q = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24300a) {
            case 0:
                go goVar = this.f24301b;
                if (goVar.Q == animator) {
                    goVar.getSubtitleTextView().setVisibility(4);
                    goVar.Q = null;
                    return;
                }
                return;
            default:
                this.f24301b.Q = null;
                return;
        }
    }
}
