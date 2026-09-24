package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class eo extends AnimatorListenerAdapter {
    public final int f23963a;
    public final fo f23964b;

    public eo(fo foVar, int i10) {
        this.f23963a = i10;
        this.f23964b = foVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f23963a) {
            case 0:
                this.f23964b.Q = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23963a) {
            case 0:
                fo foVar = this.f23964b;
                if (foVar.Q == animator) {
                    foVar.getSubtitleTextView().setVisibility(4);
                    foVar.Q = null;
                    return;
                }
                return;
            default:
                this.f23964b.Q = null;
                return;
        }
    }
}
