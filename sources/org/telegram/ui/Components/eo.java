package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class eo extends AnimatorListenerAdapter {
    public final int f23979a;
    public final fo f23980b;

    public eo(fo foVar, int i10) {
        this.f23979a = i10;
        this.f23980b = foVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f23979a) {
            case 0:
                this.f23980b.Q = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23979a) {
            case 0:
                fo foVar = this.f23980b;
                if (foVar.Q == animator) {
                    foVar.getSubtitleTextView().setVisibility(4);
                    foVar.Q = null;
                    return;
                }
                return;
            default:
                this.f23980b.Q = null;
                return;
        }
    }
}
