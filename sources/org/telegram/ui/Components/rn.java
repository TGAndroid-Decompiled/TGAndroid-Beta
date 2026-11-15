package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rn extends AnimatorListenerAdapter {
    public final int f39007a;
    public final sn f39008b;

    public rn(sn snVar, int i7) {
        this.f39007a = i7;
        this.f39008b = snVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f39007a) {
            case 0:
                this.f39008b.R = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39007a) {
            case 0:
                sn snVar = this.f39008b;
                if (snVar.R == animator) {
                    snVar.getSubtitleTextView().setVisibility(4);
                    snVar.R = null;
                    return;
                }
                return;
            default:
                this.f39008b.R = null;
                return;
        }
    }
}
