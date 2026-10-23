package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j1 extends AnimatorListenerAdapter {
    public final int f22563a;
    public final t1 f22564b;

    public j1(int i10, t1 t1Var) {
        this.f22563a = i10;
        this.f22564b = t1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22563a) {
            case 0:
                t1 t1Var = this.f22564b;
                t1Var.f23659y7.isMediaSpoilersRevealed = true;
                t1Var.invalidate();
                return;
            default:
                this.f22564b.setSelectedBackgroundProgress(0.0f);
                return;
        }
    }
}
