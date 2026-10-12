package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k1 extends AnimatorListenerAdapter {
    public final int f21427a;
    public final u1 f21428b;

    public k1(int i10, u1 u1Var) {
        this.f21427a = i10;
        this.f21428b = u1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21427a) {
            case 0:
                u1 u1Var = this.f21428b;
                u1Var.f22488y7.isMediaSpoilersRevealed = true;
                u1Var.invalidate();
                return;
            default:
                this.f21428b.setSelectedBackgroundProgress(0.0f);
                return;
        }
    }
}
