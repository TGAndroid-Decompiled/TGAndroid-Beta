package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ao extends AnimatorListenerAdapter {
    public final int f25299a;
    public final bo f25300b;

    public ao(bo boVar, int i10) {
        this.f25299a = i10;
        this.f25300b = boVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f25299a) {
            case 0:
                this.f25300b.N = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25299a) {
            case 0:
                bo boVar = this.f25300b;
                if (boVar.N == animator) {
                    boVar.getSubtitleTextView().setVisibility(4);
                    boVar.N = null;
                    return;
                }
                return;
            default:
                this.f25300b.N = null;
                return;
        }
    }
}
