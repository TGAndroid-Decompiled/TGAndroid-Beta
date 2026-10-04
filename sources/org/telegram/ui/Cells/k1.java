package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k1 extends AnimatorListenerAdapter {
    public final int f22374a;
    public final u1 f22375b;

    public k1(int i10, u1 u1Var) {
        this.f22374a = i10;
        this.f22375b = u1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22374a) {
            case 0:
                u1 u1Var = this.f22375b;
                u1Var.f23469y7.isMediaSpoilersRevealed = true;
                u1Var.invalidate();
                return;
            default:
                this.f22375b.setSelectedBackgroundProgress(0.0f);
                return;
        }
    }
}
