package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j1 extends AnimatorListenerAdapter {
    public final int f20304a;
    public final t1 f20305b;

    public j1(int i10, t1 t1Var) {
        this.f20304a = i10;
        this.f20305b = t1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20304a) {
            case 0:
                t1 t1Var = this.f20305b;
                t1Var.f21332y7.isMediaSpoilersRevealed = true;
                t1Var.invalidate();
                return;
            default:
                this.f20305b.setSelectedBackgroundProgress(0.0f);
                return;
        }
    }
}
