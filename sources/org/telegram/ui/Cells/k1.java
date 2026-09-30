package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k1 extends AnimatorListenerAdapter {
    public final int f20571a;
    public final u1 f20572b;

    public k1(int i10, u1 u1Var) {
        this.f20571a = i10;
        this.f20572b = u1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20571a) {
            case 0:
                u1 u1Var = this.f20572b;
                u1Var.f21629y7.isMediaSpoilersRevealed = true;
                u1Var.invalidate();
                return;
            default:
                this.f20572b.setSelectedBackgroundProgress(0.0f);
                return;
        }
    }
}
