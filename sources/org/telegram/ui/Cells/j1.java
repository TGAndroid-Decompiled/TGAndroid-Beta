package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j1 extends AnimatorListenerAdapter {
    public final int f23001a;
    public final t1 f23002b;

    public j1(int i10, t1 t1Var) {
        this.f23001a = i10;
        this.f23002b = t1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23001a) {
            case 0:
                t1 t1Var = this.f23002b;
                t1Var.f24073v7.isMediaSpoilersRevealed = true;
                t1Var.invalidate();
                return;
            default:
                this.f23002b.setSelectedBackgroundProgress(0.0f);
                return;
        }
    }
}
