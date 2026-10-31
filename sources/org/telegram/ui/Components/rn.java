package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rn extends AnimatorListenerAdapter {
    public final int f29966a;
    public final sn f29967b;

    public rn(sn snVar, int i10) {
        this.f29966a = i10;
        this.f29967b = snVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f29966a) {
            case 0:
                this.f29967b.Q = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29966a) {
            case 0:
                sn snVar = this.f29967b;
                if (snVar.Q == animator) {
                    snVar.getSubtitleTextView().setVisibility(4);
                    snVar.Q = null;
                    return;
                }
                return;
            default:
                this.f29967b.Q = null;
                return;
        }
    }
}
