package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k1 extends AnimatorListenerAdapter {
    public final int f22135a;
    public final u1 f22136b;

    public k1(int i10, u1 u1Var) {
        this.f22135a = i10;
        this.f22136b = u1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22135a) {
            case 0:
                u1 u1Var = this.f22136b;
                u1Var.f23230y7.isMediaSpoilersRevealed = true;
                u1Var.invalidate();
                return;
            default:
                this.f22136b.setSelectedBackgroundProgress(0.0f);
                return;
        }
    }
}
