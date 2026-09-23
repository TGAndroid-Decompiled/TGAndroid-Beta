package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j1 extends AnimatorListenerAdapter {
    public final int f20263a;
    public final t1 f20264b;

    public j1(int i10, t1 t1Var) {
        this.f20263a = i10;
        this.f20264b = t1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20263a) {
            case 0:
                t1 t1Var = this.f20264b;
                t1Var.f21292y7.isMediaSpoilersRevealed = true;
                t1Var.invalidate();
                return;
            default:
                this.f20264b.setSelectedBackgroundProgress(0.0f);
                return;
        }
    }
}
