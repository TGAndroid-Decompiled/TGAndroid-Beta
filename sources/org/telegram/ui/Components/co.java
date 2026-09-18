package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class co extends AnimatorListenerAdapter {
    public final int f23300a;
    public final eo f23301b;

    public co(eo eoVar, int i10) {
        this.f23300a = i10;
        this.f23301b = eoVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f23300a) {
            case 0:
                this.f23301b.Q = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23300a) {
            case 0:
                eo eoVar = this.f23301b;
                if (eoVar.Q == animator) {
                    eoVar.getSubtitleTextView().setVisibility(4);
                    eoVar.Q = null;
                    return;
                }
                return;
            default:
                this.f23301b.Q = null;
                return;
        }
    }
}
