package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lo extends AnimatorListenerAdapter {
    public final int f28424a;
    public final mo f28425b;

    public lo(mo moVar, int i10) {
        this.f28424a = i10;
        this.f28425b = moVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28424a) {
            case 0:
                this.f28425b.Q = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28424a) {
            case 0:
                mo moVar = this.f28425b;
                if (moVar.Q == animator) {
                    moVar.getSubtitleTextView().setVisibility(4);
                    moVar.Q = null;
                    return;
                }
                return;
            default:
                this.f28425b.Q = null;
                return;
        }
    }
}
