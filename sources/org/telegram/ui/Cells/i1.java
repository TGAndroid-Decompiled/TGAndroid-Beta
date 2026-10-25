package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i1 extends AnimatorListenerAdapter {
    public final int f24216a;
    public final s1 f24217b;

    public i1(int i10, s1 s1Var) {
        this.f24216a = i10;
        this.f24217b = s1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24216a) {
            case 0:
                s1 s1Var = this.f24217b;
                s1Var.f25363y7.isMediaSpoilersRevealed = true;
                s1Var.invalidate();
                return;
            default:
                this.f24217b.setSelectedBackgroundProgress(0.0f);
                return;
        }
    }
}
