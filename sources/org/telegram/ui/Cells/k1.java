package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k1 extends AnimatorListenerAdapter {
    public final int f22500a;
    public final u1 f22501b;

    public k1(int i10, u1 u1Var) {
        this.f22500a = i10;
        this.f22501b = u1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22500a) {
            case 0:
                u1 u1Var = this.f22501b;
                u1Var.f23567y7.isMediaSpoilersRevealed = true;
                u1Var.invalidate();
                return;
            default:
                this.f22501b.setSelectedBackgroundProgress(0.0f);
                return;
        }
    }
}
