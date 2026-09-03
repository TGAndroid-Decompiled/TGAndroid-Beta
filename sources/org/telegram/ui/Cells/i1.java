package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i1 extends AnimatorListenerAdapter {
    public final int f21167a;
    public final s1 f21168b;

    public i1(int i10, s1 s1Var) {
        this.f21167a = i10;
        this.f21168b = s1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21167a) {
            case 0:
                s1 s1Var = this.f21168b;
                s1Var.f22210v7.isMediaSpoilersRevealed = true;
                s1Var.invalidate();
                return;
            default:
                this.f21168b.setSelectedBackgroundProgress(0.0f);
                return;
        }
    }
}
