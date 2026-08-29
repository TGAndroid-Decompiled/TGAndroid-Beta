package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i1 extends AnimatorListenerAdapter {
    public final int f24473a;
    public final s1 f24474b;

    public i1(int i10, s1 s1Var) {
        this.f24473a = i10;
        this.f24474b = s1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24473a) {
            case 0:
                s1 s1Var = this.f24474b;
                s1Var.f25556u7.isMediaSpoilersRevealed = true;
                s1Var.invalidate();
                return;
            default:
                this.f24474b.setSelectedBackgroundProgress(0.0f);
                return;
        }
    }
}
