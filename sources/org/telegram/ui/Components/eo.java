package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class eo extends AnimatorListenerAdapter {
    public final int f23980a;
    public final fo f23981b;

    public eo(fo foVar, int i10) {
        this.f23980a = i10;
        this.f23981b = foVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f23980a) {
            case 0:
                this.f23981b.Q = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23980a) {
            case 0:
                fo foVar = this.f23981b;
                if (foVar.Q == animator) {
                    foVar.getSubtitleTextView().setVisibility(4);
                    foVar.Q = null;
                    return;
                }
                return;
            default:
                this.f23981b.Q = null;
                return;
        }
    }
}
