package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k1 extends AnimatorListenerAdapter {
    public final int f30540a;
    public final q1 f30541b;

    public k1(q1 q1Var, int i7) {
        this.f30540a = i7;
        this.f30541b = q1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30540a) {
            case 0:
                q1 q1Var = this.f30541b;
                q1Var.Q5.O0 = true;
                q1Var.invalidate();
                return;
            default:
                this.f30541b.setSelectedBackgroundProgress(0.0f);
                return;
        }
    }
}
