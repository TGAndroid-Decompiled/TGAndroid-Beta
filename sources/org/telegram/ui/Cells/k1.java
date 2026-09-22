package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k1 extends AnimatorListenerAdapter {
    public final int f20539a;
    public final u1 f20540b;

    public k1(int i10, u1 u1Var) {
        this.f20539a = i10;
        this.f20540b = u1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20539a) {
            case 0:
                u1 u1Var = this.f20540b;
                u1Var.f21590y7.isMediaSpoilersRevealed = true;
                u1Var.invalidate();
                return;
            default:
                this.f20540b.setSelectedBackgroundProgress(0.0f);
                return;
        }
    }
}
