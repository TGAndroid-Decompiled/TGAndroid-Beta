package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j1 extends AnimatorListenerAdapter {
    public final int f19336a;
    public final t1 f19337b;

    public j1(int i10, t1 t1Var) {
        this.f19336a = i10;
        this.f19337b = t1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19336a) {
            case 0:
                t1 t1Var = this.f19337b;
                t1Var.f20403y7.isMediaSpoilersRevealed = true;
                t1Var.invalidate();
                return;
            default:
                this.f19337b.setSelectedBackgroundProgress(0.0f);
                return;
        }
    }
}
