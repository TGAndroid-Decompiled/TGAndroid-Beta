package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class co extends AnimatorListenerAdapter {
    public final int f23091a;
    public final eo f23092b;

    public co(eo eoVar, int i10) {
        this.f23091a = i10;
        this.f23092b = eoVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f23091a) {
            case 0:
                this.f23092b.Q = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23091a) {
            case 0:
                eo eoVar = this.f23092b;
                if (eoVar.Q == animator) {
                    eoVar.getSubtitleTextView().setVisibility(4);
                    eoVar.Q = null;
                    return;
                }
                return;
            default:
                this.f23092b.Q = null;
                return;
        }
    }
}
