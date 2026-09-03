package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zn extends AnimatorListenerAdapter {
    public final int f33978a;
    public final ao f33979b;

    public zn(ao aoVar, int i10) {
        this.f33978a = i10;
        this.f33979b = aoVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f33978a) {
            case 0:
                this.f33979b.N = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33978a) {
            case 0:
                ao aoVar = this.f33979b;
                if (aoVar.N == animator) {
                    aoVar.getSubtitleTextView().setVisibility(4);
                    aoVar.N = null;
                    return;
                }
                return;
            default:
                this.f33979b.N = null;
                return;
        }
    }
}
