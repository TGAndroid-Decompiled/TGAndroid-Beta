package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j1 extends AnimatorListenerAdapter {
    public final int f23003a;
    public final t1 f23004b;

    public j1(int i10, t1 t1Var) {
        this.f23003a = i10;
        this.f23004b = t1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23003a) {
            case 0:
                t1 t1Var = this.f23004b;
                t1Var.f24075v7.isMediaSpoilersRevealed = true;
                t1Var.invalidate();
                return;
            default:
                this.f23004b.setSelectedBackgroundProgress(0.0f);
                return;
        }
    }
}
