package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k1 extends AnimatorListenerAdapter {
    public final int f20556a;
    public final u1 f20557b;

    public k1(int i10, u1 u1Var) {
        this.f20556a = i10;
        this.f20557b = u1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20556a) {
            case 0:
                u1 u1Var = this.f20557b;
                u1Var.f21610y7.isMediaSpoilersRevealed = true;
                u1Var.invalidate();
                return;
            default:
                this.f20557b.setSelectedBackgroundProgress(0.0f);
                return;
        }
    }
}
