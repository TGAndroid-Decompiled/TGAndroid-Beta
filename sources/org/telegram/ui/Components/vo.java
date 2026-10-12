package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vo extends AnimatorListenerAdapter {
    public final int f31562a;
    public final wo f31563b;

    public vo(wo woVar, int i10) {
        this.f31562a = i10;
        this.f31563b = woVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31562a) {
            case 0:
                this.f31563b.Q = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31562a) {
            case 0:
                wo woVar = this.f31563b;
                if (woVar.Q == animator) {
                    woVar.getSubtitleTextView().setVisibility(4);
                    woVar.Q = null;
                    return;
                }
                return;
            default:
                this.f31563b.Q = null;
                return;
        }
    }
}
