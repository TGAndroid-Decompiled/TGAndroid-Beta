package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class qn extends AnimatorListenerAdapter {

    public final int f31928a;

    public final rn f31929b;

    public qn(rn rnVar, int i10) {
        this.f31928a = i10;
        this.f31929b = rnVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31928a) {
            case 0:
                this.f31929b.M = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31928a) {
            case 0:
                rn rnVar = this.f31929b;
                if (rnVar.M == animator) {
                    rnVar.getSubtitleTextView().setVisibility(4);
                    rnVar.M = null;
                }
                break;
            default:
                this.f31929b.M = null;
                break;
        }
    }
}
