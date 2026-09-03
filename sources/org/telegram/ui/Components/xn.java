package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xn extends AnimatorListenerAdapter {
    public final int f30674a;
    public final yn f30675b;

    public xn(yn ynVar, int i10) {
        this.f30674a = i10;
        this.f30675b = ynVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f30674a) {
            case 0:
                this.f30675b.N = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30674a) {
            case 0:
                yn ynVar = this.f30675b;
                if (ynVar.N == animator) {
                    ynVar.getSubtitleTextView().setVisibility(4);
                    ynVar.N = null;
                    return;
                }
                return;
            default:
                this.f30675b.N = null;
                return;
        }
    }
}
