package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qo extends AnimatorListenerAdapter {
    public final int f28339a;
    public final ro f28340b;

    public qo(ro roVar, int i10) {
        this.f28339a = i10;
        this.f28340b = roVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28339a) {
            case 0:
                this.f28340b.Q = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28339a) {
            case 0:
                ro roVar = this.f28340b;
                if (roVar.Q == animator) {
                    roVar.getSubtitleTextView().setVisibility(4);
                    roVar.Q = null;
                    return;
                }
                return;
            default:
                this.f28340b.Q = null;
                return;
        }
    }
}
