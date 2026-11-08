package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k1 extends AnimatorListenerAdapter {
    public final int f29405a;
    public final q1 f29406b;

    public k1(q1 q1Var, int i7) {
        this.f29405a = i7;
        this.f29406b = q1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29405a) {
            case 0:
                q1 q1Var = this.f29406b;
                q1Var.P5.M0 = true;
                q1Var.invalidate();
                return;
            default:
                this.f29406b.setSelectedBackgroundProgress(0.0f);
                return;
        }
    }
}
