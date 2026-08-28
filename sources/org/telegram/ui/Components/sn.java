package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sn extends AnimatorListenerAdapter {
    public final int f32529a;
    public final tn f32530b;

    public sn(tn tnVar, int i9) {
        this.f32529a = i9;
        this.f32530b = tnVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32529a) {
            case 0:
                this.f32530b.M = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32529a) {
            case 0:
                tn tnVar = this.f32530b;
                if (tnVar.M == animator) {
                    tnVar.getSubtitleTextView().setVisibility(4);
                    tnVar.M = null;
                    return;
                }
                return;
            default:
                this.f32530b.M = null;
                return;
        }
    }
}
