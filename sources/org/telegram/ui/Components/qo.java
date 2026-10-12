package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qo extends AnimatorListenerAdapter {
    public final int f28656a;
    public final ro f28657b;

    public qo(ro roVar, int i10) {
        this.f28656a = i10;
        this.f28657b = roVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28656a) {
            case 0:
                this.f28657b.Q = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28656a) {
            case 0:
                ro roVar = this.f28657b;
                if (roVar.Q == animator) {
                    roVar.getSubtitleTextView().setVisibility(4);
                    roVar.Q = null;
                    return;
                }
                return;
            default:
                this.f28657b.Q = null;
                return;
        }
    }
}
