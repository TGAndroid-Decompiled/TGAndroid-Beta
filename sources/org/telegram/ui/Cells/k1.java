package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k1 extends AnimatorListenerAdapter {
    public final int f22367a;
    public final u1 f22368b;

    public k1(int i10, u1 u1Var) {
        this.f22367a = i10;
        this.f22368b = u1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22367a) {
            case 0:
                u1 u1Var = this.f22368b;
                u1Var.f23462y7.isMediaSpoilersRevealed = true;
                u1Var.invalidate();
                return;
            default:
                this.f22368b.setSelectedBackgroundProgress(0.0f);
                return;
        }
    }
}
