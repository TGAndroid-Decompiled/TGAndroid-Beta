package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i1 extends AnimatorListenerAdapter {
    public final int f24218a;
    public final s1 f24219b;

    public i1(int i10, s1 s1Var) {
        this.f24218a = i10;
        this.f24219b = s1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24218a) {
            case 0:
                s1 s1Var = this.f24219b;
                s1Var.f25365y7.isMediaSpoilersRevealed = true;
                s1Var.invalidate();
                return;
            default:
                this.f24219b.setSelectedBackgroundProgress(0.0f);
                return;
        }
    }
}
