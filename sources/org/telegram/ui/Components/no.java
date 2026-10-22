package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class no extends AnimatorListenerAdapter {
    public final int f28859a;
    public final oo f28860b;

    public no(oo ooVar, int i10) {
        this.f28859a = i10;
        this.f28860b = ooVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28859a) {
            case 0:
                this.f28860b.Q = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28859a) {
            case 0:
                oo ooVar = this.f28860b;
                if (ooVar.Q == animator) {
                    ooVar.getSubtitleTextView().setVisibility(4);
                    ooVar.Q = null;
                    return;
                }
                return;
            default:
                this.f28860b.Q = null;
                return;
        }
    }
}
