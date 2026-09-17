package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class co extends AnimatorListenerAdapter {
    public final int f23088a;
    public final eo f23089b;

    public co(eo eoVar, int i10) {
        this.f23088a = i10;
        this.f23089b = eoVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f23088a) {
            case 0:
                this.f23089b.Q = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23088a) {
            case 0:
                eo eoVar = this.f23089b;
                if (eoVar.Q == animator) {
                    eoVar.getSubtitleTextView().setVisibility(4);
                    eoVar.Q = null;
                    return;
                }
                return;
            default:
                this.f23089b.Q = null;
                return;
        }
    }
}
