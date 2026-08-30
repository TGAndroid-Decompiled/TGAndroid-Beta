package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yn extends AnimatorListenerAdapter {
    public final int f31059a;
    public final zn f31060b;

    public yn(zn znVar, int i10) {
        this.f31059a = i10;
        this.f31060b = znVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31059a) {
            case 0:
                this.f31060b.N = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31059a) {
            case 0:
                zn znVar = this.f31060b;
                if (znVar.N == animator) {
                    znVar.getSubtitleTextView().setVisibility(4);
                    znVar.N = null;
                    return;
                }
                return;
            default:
                this.f31060b.N = null;
                return;
        }
    }
}
