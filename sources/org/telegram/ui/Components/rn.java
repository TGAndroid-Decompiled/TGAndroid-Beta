package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rn extends AnimatorListenerAdapter {
    public final int f30025a;
    public final sn f30026b;

    public rn(sn snVar, int i10) {
        this.f30025a = i10;
        this.f30026b = snVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f30025a) {
            case 0:
                this.f30026b.Q = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30025a) {
            case 0:
                sn snVar = this.f30026b;
                if (snVar.Q == animator) {
                    snVar.getSubtitleTextView().setVisibility(4);
                    snVar.Q = null;
                    return;
                }
                return;
            default:
                this.f30026b.Q = null;
                return;
        }
    }
}
