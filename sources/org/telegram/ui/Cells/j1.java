package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j1 extends AnimatorListenerAdapter {
    public final int f22154a;
    public final t1 f22155b;

    public j1(int i10, t1 t1Var) {
        this.f22154a = i10;
        this.f22155b = t1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22154a) {
            case 0:
                t1 t1Var = this.f22155b;
                t1Var.f23206y7.isMediaSpoilersRevealed = true;
                t1Var.invalidate();
                return;
            default:
                this.f22155b.setSelectedBackgroundProgress(0.0f);
                return;
        }
    }
}
