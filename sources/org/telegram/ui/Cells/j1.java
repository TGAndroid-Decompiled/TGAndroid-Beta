package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j1 extends AnimatorListenerAdapter {
    public final int f22153a;
    public final t1 f22154b;

    public j1(int i10, t1 t1Var) {
        this.f22153a = i10;
        this.f22154b = t1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22153a) {
            case 0:
                t1 t1Var = this.f22154b;
                t1Var.f23205y7.isMediaSpoilersRevealed = true;
                t1Var.invalidate();
                return;
            default:
                this.f22154b.setSelectedBackgroundProgress(0.0f);
                return;
        }
    }
}
