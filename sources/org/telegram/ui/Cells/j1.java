package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j1 extends AnimatorListenerAdapter {
    public final int f21241a;
    public final t1 f21242b;

    public j1(int i10, t1 t1Var) {
        this.f21241a = i10;
        this.f21242b = t1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21241a) {
            case 0:
                t1 t1Var = this.f21242b;
                t1Var.f22273v7.isMediaSpoilersRevealed = true;
                t1Var.invalidate();
                return;
            default:
                this.f21242b.setSelectedBackgroundProgress(0.0f);
                return;
        }
    }
}
