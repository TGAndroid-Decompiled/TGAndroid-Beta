package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wn extends AnimatorListenerAdapter {
    public final int f34444a;
    public final xn f34445b;

    public wn(xn xnVar, int i10) {
        this.f34444a = i10;
        this.f34445b = xnVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f34444a) {
            case 0:
                this.f34445b.M = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34444a) {
            case 0:
                xn xnVar = this.f34445b;
                if (xnVar.M == animator) {
                    xnVar.getSubtitleTextView().setVisibility(4);
                    xnVar.M = null;
                    return;
                }
                return;
            default:
                this.f34445b.M = null;
                return;
        }
    }
}
