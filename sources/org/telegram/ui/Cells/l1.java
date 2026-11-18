package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l1 extends AnimatorListenerAdapter {
    public final int f30965a;
    public final r1 f30966b;

    public l1(r1 r1Var, int i7) {
        this.f30965a = i7;
        this.f30966b = r1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30965a) {
            case 0:
                r1 r1Var = this.f30966b;
                r1Var.Q5.O0 = true;
                r1Var.invalidate();
                return;
            default:
                this.f30966b.setSelectedBackgroundProgress(0.0f);
                return;
        }
    }
}
