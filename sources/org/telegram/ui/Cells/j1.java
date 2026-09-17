package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j1 extends AnimatorListenerAdapter {
    public final int f22181a;
    public final t1 f22182b;

    public j1(int i10, t1 t1Var) {
        this.f22181a = i10;
        this.f22182b = t1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22181a) {
            case 0:
                t1 t1Var = this.f22182b;
                t1Var.f23233y7.isMediaSpoilersRevealed = true;
                t1Var.invalidate();
                return;
            default:
                this.f22182b.setSelectedBackgroundProgress(0.0f);
                return;
        }
    }
}
